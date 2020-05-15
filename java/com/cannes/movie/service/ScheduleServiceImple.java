package com.cannes.movie.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cannes.movie.domain.ScheduleDetailVO;
import com.cannes.movie.domain.ScheduleVO;
import com.cannes.movie.persistance.ScheduleDAO;

@Service
public class ScheduleServiceImple implements ScheduleService {
	private static final Logger logger =
			LoggerFactory.getLogger(ScheduleServiceImple.class);
	
	@Autowired
	private ScheduleDAO scheduleDao;
	
	@Override
	public int create(ScheduleVO vo) {
		logger.info("create() 호출");
		return scheduleDao.scheduleInsert(vo);
	} // end create

	@Override
	public int update(ScheduleVO vo) {
		logger.info("update() 호출");
		return scheduleDao.scheduleUpdate(vo);
	} // end update

	@Override
	public int delete(int scheduleNo) {
		logger.info("delete() 호출");
		return scheduleDao.scheduleDelete(scheduleNo);
	} // end delete

	@Override
	public List<ScheduleVO> readByMovie(int movieNo) {
		logger.info("readByMovie() 호출");
		return scheduleDao.scheduleSelectByMovie(movieNo);
	} // end readByMovie

	@Override
	public List<ScheduleVO> readByDate(Date scheduleDate) {
		logger.info("readByDate() 호출");
		return scheduleDao.scheduleSelectByDate(scheduleDate);
	} // end readDate()

	@Override
	public List<ScheduleDetailVO> readDetail(ScheduleDetailVO vo) {
		logger.info("readDetail() 호출");
		return scheduleDao.scheduleDetailSelect(vo);
	} // end readDetail()

} // end ScheduleServiceImple
