package com.cannes.movie.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cannes.movie.domain.MovieNoVO;
import com.cannes.movie.domain.MovieVO;
import com.cannes.movie.persistance.MovieDAO;

@Service
public class MovieServiceImple implements MovieService {
	private static final Logger logger = 
			LoggerFactory.getLogger(MovieServiceImple.class);
	
	@Autowired
	private MovieDAO movieDao;
	
	@Override
	public List<MovieVO> readAll() {
		logger.info("readAll() 호출");
		return movieDao.movieSelectAll();
	} // end readAll()

	@Override
	public List<MovieVO> readByTitle(String movieTitle) {
		logger.info("readByTitle() 호출");
		return movieDao.movieSelectByTitle(movieTitle);
	} // end readByTitle()

	@Override
	public MovieVO readDetail(int movieNo) {
		logger.info("readDetail() 호출");
		return movieDao.movieSelectDetail(movieNo);
	} // end readDetail()
	
	@Override
	public List<MovieVO> readBoxOffice(String[] movieNums) {
		logger.info("readBoxOffice() 호출");
		return movieDao.movieSelectBoxOffice(movieNums);
	} // end readBoxOffice()
	
	@Override
	public List<MovieVO> readBooking(Date scheduleDate) {
		logger.info("readBooking() 호출");
		return movieDao.movieSelectBooking(scheduleDate);
	} // end readBooking()

	@Override
	public int create(MovieVO vo) {
		logger.info("create() 호출");
		return movieDao.movieInsert(vo);
	} // end create()

	@Override
	public int update(MovieVO vo) {
		logger.info("update() 호출");
		return movieDao.movieUpdate(vo);
	} // end update()

	@Override
	public int delete(int movieNo) {
		logger.info("delete() 호출");
		return movieDao.movieDelete(movieNo);
	} // end delete()



} // end MovieServiceImple
