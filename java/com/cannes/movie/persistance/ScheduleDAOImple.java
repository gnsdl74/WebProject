package com.cannes.movie.persistance;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cannes.movie.domain.ScheduleDetailVO;
import com.cannes.movie.domain.ScheduleVO;

@Repository
public class ScheduleDAOImple implements ScheduleDAO {
	
	private static final String NAMESPACE =
			"com.cannes.movie.ScheduleMapper";
	private static final Logger logger = LoggerFactory.getLogger(ScheduleDAOImple.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int scheduleInsert(ScheduleVO vo) {
		logger.info("scheduleInsert 호출");
		return sqlSession.insert(NAMESPACE + ".scheduleInsert", vo);
	} // end scheduleInsert()

	@Override
	public List<ScheduleVO> scheduleSelectByMovie(int movieNo) {
		logger.info("scheduleSelectByMovie 호출");
		return sqlSession.selectList(NAMESPACE + ".scheduleSelectByMovie", movieNo);
	} // end scheduleSelectByMovie()

	@Override
	public List<ScheduleVO> scheduleSelectByDate(Date scheduleDate) {
		logger.info("scheduleSelectByDate 호출");
		return sqlSession.selectList(NAMESPACE + ".scheduleSelectByDate", scheduleDate);
	} // end scheduleSelectByDate()

	@Override
	public int scheduleUpdate(ScheduleVO vo) {
		logger.info("scheduleUpdate 호출");
		return sqlSession.update(NAMESPACE + ".scheduleUpdate", vo);
	} // end scheduleUdpate()

	@Override
	public int scheduleDelete(int scheduleNo) {
		logger.info("scheduleDelete 호출");
		return sqlSession.delete(NAMESPACE + ".scheduleDelete", scheduleNo);
	} // end scheduleDelete()

	@Override
	public List<ScheduleDetailVO> scheduleDetailSelect(ScheduleDetailVO vo) {
		logger.info("scheduleDetailSelect 호출");
		return sqlSession.selectList(NAMESPACE + ".scheduleDetailSelect", vo);
	} // end scheduleDetailSelect()

} // end ScheduleDAOImple
