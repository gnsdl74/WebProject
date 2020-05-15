package com.cannes.movie.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cannes.movie.domain.MovieVO;
import com.cannes.movie.domain.ScheduleDetailVO;
import com.cannes.movie.service.MovieService;
import com.cannes.movie.service.ScheduleService;

@Controller
@RequestMapping(value= "/reservation")
public class BookingController {
	private static final Logger logger = LoggerFactory.getLogger(BookingController.class);
	
	@Autowired
	private MovieService movieService;
	@Autowired
	private ScheduleService scheduleService;
	
	@GetMapping(value = "/booking")
	public void bookingMain(Model model) {
		logger.info("bookingMain() 호출");
		
		// 오늘날짜 이후에 상영중인 영화제목  가져오기  
		
		
		Date date = new Date();	
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String sdfDate = sdf.format(date);
		
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");
		String currentTime = sdfTime.format(date); // 현재 시간 구하기
		Date today = null;
		try {
			today = sdf.parse(sdfDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		logger.info("오늘날짜 : " + today);
		logger.info("현재시간 : " + currentTime);
	
		List<MovieVO> movieList = movieService.readBooking(today); // 상영중인 영화만 출력

		ScheduleDetailVO scheduleVO = new ScheduleDetailVO(0, today, currentTime, null, null, null, 0, 0, 0, 0);
		List<ScheduleDetailVO> scheduleList = scheduleService.readDetail(scheduleVO); //오늘 날짜 현재시간 이후의 영화 가져오기
		for(ScheduleDetailVO vo : scheduleList){
			logger.info(vo.toString());
		}
		model.addAttribute("movieList", movieList);
		model.addAttribute("scheduleList", scheduleList);
//		model.addAttribute("scheduleList", )
	} // end ticketingMain()	
	
	
	@GetMapping(value = "/ha")
	public void haMain() {
		System.out.println("흠1");
	} // end ticketingMain()
	
} // end TicketController
