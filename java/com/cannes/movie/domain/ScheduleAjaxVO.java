package com.cannes.movie.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ScheduleAjaxVO {
	private String dateValue;	
	private int movieNo1;
	private int movieNo2;
	private String year;
	private String month;
	private String date;
	private Date scheduleDate;
	
	// 생성자
	public ScheduleAjaxVO() {}
	public ScheduleAjaxVO(String dateValue, int movieNo1, int movieNo2) {		
		
		String[] dateSplite = dateValue.split("-");
		this.year = dateSplite[0];
		this.date =  dateSplite[2];
		switch(dateSplite[1]) {
		case "Jan" : this.month = "01";
		break;
		case "Feb" : this.month = "02";
		break;
		case "Mar" : this.month = "03";
		break;
		case "Apr" : this.month = "04";
		break;
		case "May" : this.month = "05";
		break;
		case "Jun" : this.month = "06";
		break;
		case "Jul" : this.month = "07";
		break;
		case "Aug" : this.month = "08";
		break;
		case "Sep" : this.month = "09";
		break;
		case "Oct" : this.month = "10";
		break;
		case "Nov" : this.month = "11";
		break;
		case "Dec" : this.month = "12";
		break;			
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		dateValue = year + month + date;
		try {
			this.scheduleDate = sdf.parse(dateValue);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		this.movieNo1 = movieNo1;
		this.movieNo2 = movieNo2;
	}
	
	// getter,setter
	public String getDateValue() {
		return dateValue;
	}
	public void setDateValue(String dateValue) {
		this.dateValue = dateValue;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	
	@Override
	public String toString() {
		String str = "영화상영일정 : " + dateValue + "\n"
				+ "영화번호 1 : " + movieNo1 + "\n"
				+ "영화번호 2 : " + movieNo2 + "\n"
				+ "year : " + year + "\n"
				+ "month : " + month + "\n"
				+ "date : " + date + "\n"
				+ "scheduleDate : " + scheduleDate + "\n";
				
		return str;
	}
	
	
}
