package com.cannes.movie.persistance;

import java.util.List;

import com.cannes.movie.domain.MemberVO;

public interface MemberDAO {
	/* 관리자용 메소드 */
	List<MemberVO> memberSelectAll(); // 전체 회원 목록
	List<MemberVO> memberSelectById_Name_Phone(String keyword); // 아이디, 이름, 핸드폰번호로 회원 찾기
	
	/* 회원용 메소드 */
	MemberVO memberSelectDetail(MemberVO vo); // 회원 세부정보
	int memberInsert(MemberVO vo); // 회원 가입
	int memberUpdate(MemberVO vo); // 회원정보 수정
	int memberDelete(MemberVO vo); // 회원 탈퇴
	
} // end MemberDAO
