package com.cannes.movie.service;

import java.util.List;

import com.cannes.movie.domain.MemberVO;

public interface MemberService {
	/* 관리자용 메소드 */
	List<MemberVO> readAll(); // 전체 회원 목록
	List<MemberVO> readById_Name_Phone(String keyword); // 아이디, 이름, 핸드폰번호로 회원 찾기
	
	/* 회원용 메소드 */
	MemberVO readDetail(MemberVO vo); // 회원 세부정보
	int create(MemberVO vo); // 회원 가입
	int update(MemberVO vo); // 회원정보 수정
	int delete(MemberVO vo); // 회원 탈퇴
	
} // end MemberService
