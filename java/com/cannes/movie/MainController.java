package com.cannes.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cannes.movie.domain.BoxOfficeVO;
import com.cannes.movie.domain.MovieVO;
import com.cannes.movie.domain.NoticeVO;
import com.cannes.movie.pageutil.PageCriteria;
import com.cannes.movie.service.MovieService;
import com.cannes.movie.service.NoticeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.or.kobis.kobisopenapi.consumer.rest.KobisOpenAPIRestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private NoticeService noticeService;

	@GetMapping(value = { "/", "/main" })
	public String main(Model model) {
		logger.info("main페이지 호출");

		String targetDt = "20200510"; // 주간(월~일) 박스오피스
		String itemPerPage = "5";
		String weekGb = "0";
		String multiMovieYn = "";
		String repNationCd = "";
		String wideAreaCd = "";

		String key = "26a7c12ee4dabdc760c8b670a29b1fef";
		KobisOpenAPIRestService service = new KobisOpenAPIRestService(key);

		try {
			String dailyResponse = service.getWeeklyBoxOffice(true, targetDt, itemPerPage, weekGb, multiMovieYn,
					repNationCd, wideAreaCd);

			// JSON 데이터 추출을 위한 도구 클래스(Object로 변환해주지 않음)
			ObjectMapper mapper = new ObjectMapper();

			/*
			 * JSON 데이터 dailyResponse를 HashMap형태로 변경 원하는 데이터의 값을 추출하기 위해 JSON 데이터의 구조에 맞게
			 * HashMap<K, V>과 ArrayList<E>를 사용 원하는 깊이에 도달하면 해당 JSON 데이터형식을 String형식으로
			 * 변환(writeValueAsString())하여 해당 데이터를 읽어온다.(readValue()) mapper.readValue(...) :
			 * JSON데이터를 Java object로 변환 -> 해당 메소드에는 JSON형식이나 String형식 등을 매개변수로 가짐
			 */
			HashMap<String, Object> weeklyResult = mapper.readValue(dailyResponse, HashMap.class);
			System.out.println("DR : " + weeklyResult);
			HashMap<String, Object> boxOfficeResult = (HashMap<String, Object>) weeklyResult.get("boxOfficeResult");
			System.out.println("R2 : " + boxOfficeResult);
			ArrayList<BoxOfficeVO> weeklyBoxOfficeList = (ArrayList<BoxOfficeVO>) boxOfficeResult
					.get("weeklyBoxOfficeList");
			System.out.println(weeklyBoxOfficeList);

			// DB쿼리에 넘기기 위한 movieNums과 정렬하기 위한 rank 배열선언
			String[] movieNums = new String[weeklyBoxOfficeList.size()];
			String[] rank = new String[weeklyBoxOfficeList.size()];

			// DB에서 가져온 데이터와 비교하여 랭킹 선정할 HashMap
			HashMap<String, String> rankCheck = new HashMap<>();

			// movieCd와 rank을 가져와서 배열에 저장
			for (int i = 0; i < weeklyBoxOfficeList.size(); i++) {
				HashMap<BoxOfficeVO, Object> moiveInfo = mapper.readValue(mapper.writeValueAsString(weeklyBoxOfficeList.get(i)), HashMap.class);
				movieNums[i] = (String) moiveInfo.get("movieCd");
				rank[i] = (String) moiveInfo.get("rank");
				rankCheck.put(movieNums[i], rank[i]);

				System.out.println(movieNums[i]);
				System.out.println(rank[i]);
				System.out.println(rankCheck);
			}

			// rankCheck와 list를 합칠 map
			TreeMap<String, MovieVO> sortList = new TreeMap<>();
			
			// 영화번호 배열을 넘겨서 DB에서 해당 영화들의 정보 가져오기
			List<MovieVO> list = movieService.readBoxOffice(movieNums);
			for(MovieVO vo : list) {
				String ranking = rankCheck.get(vo.getMovieNo()+"");
				sortList.put(ranking, vo);
				System.out.println("순위 : " + ranking);
			}
			System.out.println(sortList);

			model.addAttribute("weeklyList", sortList); // 영화정보

			// 주간 박스오피스 영화들의 영화코드를 뽑아서 검색
			// 영화DB에 영화코드 넣어서 가져오기
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PageCriteria c = new PageCriteria(1, 4);

		List<NoticeVO> list = noticeService.readPage(c);
		
		model.addAttribute("noticeList", list);

		return "/main";
	} // end main()

} // end HomeController
