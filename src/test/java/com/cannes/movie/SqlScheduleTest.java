package com.cannes.movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cannes.movie.domain.PayVO;
import com.cannes.movie.domain.ReplyVO;
import com.cannes.movie.domain.ScheduleVO;
import com.cannes.movie.domain.SeatVO;
import com.cannes.movie.domain.TheaterVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" }
)
// spring 하위에 있는 xml 설정파일을 모두 포함
public class SqlScheduleTest {
	private static final Logger logger = LoggerFactory.getLogger(SqlScheduleTest.class);
	// board-mapper의 namespace와 아래의 NAMESPACE가 같아야함
	private static final String NAMESPACE = "com.cannes.movie.TheaterMapper";

	@Autowired
	private SqlSession sqlSession;

	@Test
	public void paySelectTest() {
//		String date1 = "201218";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//		
//		Date date = null;
//		try {
//			date = sdf.parse(date1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(date);
//		TheaterVO vo = new TheaterVO(4, "2관", 50);
		
//		int result = sqlSession.insert(NAMESPACE + ".theaterInsert", vo);
//		logger.info("결과 : " + result);
		
		
//		List<TheaterVO> list = sqlSession.selectList(NAMESPACE + ".theaterSelectAll");
//		for(TheaterVO vo : list) {
//			logger.info(vo.toString());
//		}		
		
//		SeatVO vo = sqlSession.selectOne(NAMESPACE + ".scheduleSelectNo", vo1);
//		logger.info(vo.toString());
		
//		int result = sqlSession.update(NAMESPACE + ".theaterUpdate", vo);
//		logger.info("결과 : " + result);
	
//		int result = sqlSession.delete(NAMESPACE + ".theaterDelete", 2);
//		logger.info("결과 : " + result);
	
	} // end paySelectTest()

} // end SqlSessionTest
