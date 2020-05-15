package com.cannes.movie.controller;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cannes.movie.domain.MovieVO;
import com.cannes.movie.domain.ScheduleAjaxVO;
import com.cannes.movie.domain.ScheduleDetailVO;
import com.cannes.movie.domain.ScheduleVO;
import com.cannes.movie.domain.TheaterVO;
import com.cannes.movie.service.MemberService;
import com.cannes.movie.service.MovieService;
import com.cannes.movie.service.ScheduleService;
import com.cannes.movie.service.TheaterService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
@RequestMapping(value = "/schedules")
public class ScheduleRESTController {
	private static final Logger logger = LoggerFactory.getLogger(ScheduleRESTController.class);

	@Autowired
	private ScheduleService scheduleService;
	
	
	@PostMapping()
	 public ResponseEntity<List<ScheduleDetailVO>> readSchedules(@RequestBody ScheduleAjaxVO vo) {
		 logger.info("readSchedules() 호출");	  
		 
		 Date date = new Date();
		 SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");
		String currentTime = sdfTime.format(date); // 현재 시간 구하기
		
		 ScheduleAjaxVO dateVO = new ScheduleAjaxVO(vo.getDateValue(), vo.getMovieNo1(), vo.getMovieNo2()); 
		 // 영화번호와 날짜를 받아오는 VO
		 logger.info(dateVO.toString());
		 ScheduleDetailVO scheduleVO = new ScheduleDetailVO
				 (0, dateVO.getScheduleDate(),currentTime, null, null, null, 0, 0, 0, 0);
		 List<ScheduleDetailVO> scheduleList = scheduleService.readDetail(scheduleVO);
		 for(ScheduleDetailVO vo1  : scheduleList) {
			logger.info(vo1.toString());
		 }
		 return new ResponseEntity<List<ScheduleDetailVO>>(scheduleList,HttpStatus.OK); // new ResponseEntity<List<ScheduleDetailVO>>(list,HttpStatus.OK);
	 }
	
	

	 @GetMapping(value = "/all/{date}")
	 public ResponseEntity<List<ScheduleDetailVO>> readSchedules(
			 @PathVariable("date") String vo) {
		 logger.info("readSchedules() 호출");	  
//		 List<ScheduleDetailVO> list = scheduleService.readDetail(vo);
//		 for(ScheduleDetailVO vo1: list) {
//			 logger.info(vo1.toString());
//			 
//		 }
		 return null; // new ResponseEntity<List<ScheduleDetailVO>>(list,HttpStatus.OK);
	 }
	
 

} // end ScheduleRESTController
