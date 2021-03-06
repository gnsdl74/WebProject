package com.cannes.movie.domain;

import java.util.Date;

// Schedule테이블에 있는 *.no로 각 테이블에 데이터를 받아와 합친 schedule 세부목록 
public class ScheduleDetailVO {

	private int scheduleNo;
	private Date scheduleDate;
	private String scheduleTime;
	private String movieTitle;
	private String movieShowtime;
	private String theaterName;	
	private int theaterSeat;
	private int seatCount;
	private int movieNo1;
	private int movieNo2;
	
	// 생성자
	public ScheduleDetailVO() {}
	public ScheduleDetailVO(int scheduleNo, Date scheduleDate, String scheduleTime, String movieTitle, String movieShowtime, String theaterName,
			int theaterSeat, int seatCount, int movieNo1, int movieNo2) {
		this.scheduleNo = scheduleNo;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime;
		this.movieTitle = movieTitle;
		this.movieShowtime = movieShowtime;
		this.theaterName = theaterName;
		this.theaterSeat = theaterSeat;
		this.seatCount = seatCount;
		this.movieNo1 = movieNo1;
		this.movieNo2 = movieNo2;
	}	
	
	// getter/setter
	public int getScheduleNo() {
		return scheduleNo;
	}
	public void setScheduleNo(int scheduleNo) {
		this.scheduleNo = scheduleNo;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieShowtime() {
		return movieShowtime;
	}
	public void setMovieShowtime(String movieShowtime) {
		this.movieShowtime = movieShowtime;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public int getTheaterSeat() {
		return theaterSeat;
	}
	public void setTheaterSeat(int theaterSeat) {
		this.theaterSeat = theaterSeat;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public int getMovieNo1() {
		return movieNo1;
	}
	public void setMovieNo1(int movieNo1) {
		this.movieNo1 = movieNo1;
	}
	public int getMovieNo2() {
		return movieNo2;
	}
	public void setMovieNo2(int movieNo2) {
		this.movieNo2 = movieNo2;
	}	
	// end getter/setter
	
	@Override
	public String toString() {
		String str = "상영일자 번호 : " + scheduleNo + "\n"
				+ "상영 일자 : " + scheduleDate + "\n"
				+ "상영 시간 : " + scheduleTime + "\n"
				+ "영화 제목 : " + movieTitle + "\n"
				+ "영화 상영시간 : " + movieShowtime + "\n"
				+ "상영관 이름 : " + theaterName + "\n"
				+ "상영관 좌석 수 : " + theaterSeat + "\n"
				+ "사용 가능한 좌석 수 : " + seatCount + "\n"
				+ "영화 번호1 : " + movieNo1 + "\n"
				+ "영화 번호2 : " + movieNo2;
		return str;
	} // end toString()

	
	
} // end ReservationVO
