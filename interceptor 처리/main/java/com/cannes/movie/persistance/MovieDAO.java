package com.cannes.movie.persistance;

import java.util.List;

import com.cannes.movie.domain.MovieVO;

public interface MovieDAO {
	/* 공용 메소드(회원, 관리자, 비회원) */
	List<MovieVO> movieSelectAll(); // 영화 전체 목록
	List<MovieVO> movieSelectByTitle(String movieTitle); // 영화 제목 검색
	MovieVO movieSelectDetail(int movieNo); // 영화 세부정보 가져오기
	
	/* 관리자용 메소드 */
	int movieInsert(MovieVO vo); // 영화 등록
	int movieUpdate(MovieVO vo); // 영화 수정
	int movieDelete(int movieNo); // 영화 삭제
	
} // end MovieDAO
