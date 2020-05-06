package com.cannes.movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cannes.movie.domain.MovieVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" }
)
// spring 하위에 있는 xml 설정파일을 모두 포함
public class SqlMovieTest {
	private static final Logger logger = LoggerFactory.getLogger(SqlMovieTest.class);
	// board-mapper의 namespace와 아래의 NAMESPACE가 같아야함
	private static final String NAMESPACE = "com.cannes.movie.MovieMapper";

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void SqlMovieTest() {
//		List<MovieVO> list = sqlSession.selectList(NAMESPACE + ".movieSelectAll", null);
//		for(MovieVO vo : list) {
//			logger.info(vo + "");
//		}
		
//		String keyword = "터스";
//		keyword = "%" + keyword + "%";
//		
//		List<MovieVO> list = sqlSession.selectList(NAMESPACE + ".movieSelectByTitle", keyword);
//		for(MovieVO vo : list) {
//			logger.info(vo + "");
//		}
		
//		int num = 2;
//		MovieVO vo = sqlSession.selectOne(NAMESPACE + ".movieSelectDetail", num);
//		logger.info(vo + "");
		
//		String date = "2016/12/07";
//		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
//		try {
//			Date movieDate = sdf.parse(date);
//			MovieVO vo = new MovieVO(3, "드라마, 뮤지컬 / 128분", 12, "라라랜드", "황홀한 사랑, 순수한 희망, 격렬한 열정…" + 
//					"이 곳에서 모든 감정이 폭발한다!" + 
//					"꿈을 꾸는 사람들을 위한 별들의 도시 ‘라라랜드’." + 
//					" 재즈 피아니스트 ‘세바스찬’(라이언 고슬링)과 배우 지망생 ‘미아’(엠마 스톤)," + 
//					" 인생에서 가장 빛나는 순간 만난 두 사람은" + 
//					" 미완성인 서로의 무대를 만들어가기 시작한다.", "데이미언 셔젤", "라이언 고슬링, 엠마 스톤, 존 레전드, 로즈마리 드윗, J.K.시몬스", movieDate, "RecentlyLaLaLand_Poster", "youtubeOfficialLaLaLand");
//			
//			int result = sqlSession.update(NAMESPACE + ".movieUpdate", vo);
//			logger.info(result + "");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
//		int num = 4;
//		int result = sqlSession.delete(NAMESPACE + ".movieDelete", num);
//		logger.info(result + "");
		
	} // end SqlMovieTest()
	
} // end SqlMovieTest
