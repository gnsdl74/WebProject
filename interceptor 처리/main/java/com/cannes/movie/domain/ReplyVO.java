package com.cannes.movie.domain;

import java.util.Date;

public class ReplyVO {
	private int replyNo;
	private int memberNo;
	private int movieNo;
	private String replyContent;
	private Date replyDate;
	private String replyGrade;

	// 생성자
	public ReplyVO() {}
	public ReplyVO(int replyNo, int memberNo, int movieNo, String replyContent, Date replyDate, String replyGrade) {
		this.replyNo = replyNo;
		this.memberNo = memberNo;
		this.movieNo = movieNo;
		this.replyContent = replyContent;
		this.replyDate = replyDate;
		this.replyGrade = replyGrade;
	}
	// end 생성자
	
	// getter, setter
	public int getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getMovieNo() {
		return movieNo;
	}
	public void setMovieNo(int movieNo) {
		this.movieNo = movieNo;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	public String getReplyGrade() {
		return replyGrade;
	}
	public void setReplyGrade(String replyGrade) {
		this.replyGrade = replyGrade;
	};
	// end getter, setter
	
	@Override
	public String toString() {
		String str = "댓글 번호 : " + replyNo + "\n"
					+ "회원 번호 : " + memberNo + "\n"
					+ "영화 번호 : " + movieNo + "\n"
					+ "댓글 내용 : " + replyContent + "\n"
					+ "댓글 작성일 : " + replyDate + "\n"
					+ "댓글 평점 : " + replyGrade;
		return str;
	} // end toString()
	
} // end ReplyVO
