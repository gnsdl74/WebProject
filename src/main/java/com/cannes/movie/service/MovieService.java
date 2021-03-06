package com.cannes.movie.service;

import java.util.List;

import com.cannes.movie.domain.MovieVO;

public interface MovieService {
	/* 공용 메소드(회원, 관리자, 비회원) */
	List<MovieVO> readAll(); // 영화 전체 목록
	List<MovieVO> readByTitle(String movieTitle); // 영화 제목 검색
	MovieVO readDetail(int movieNo); // 영화 세부정보 가져오기
	
	/* 관리자용 메소드 */
	int create(MovieVO vo); // 영화 등록
	int update(MovieVO vo); // 영화 수정
	int delete(int movieNo); // 영화 삭제
	
} // end MovieService
