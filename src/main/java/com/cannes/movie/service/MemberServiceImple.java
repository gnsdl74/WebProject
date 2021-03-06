package com.cannes.movie.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cannes.movie.domain.MemberVO;
import com.cannes.movie.persistance.MemberDAO;

@Service
public class MemberServiceImple implements MemberService {
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberServiceImple.class);

	@Autowired
	private MemberDAO memberDao;

	@Override
	public List<MemberVO> readAll() {
		logger.info("readAll() 호출");
		return memberDao.memberSelectAll();
	} // end readAll()

	@Override
	public List<MemberVO> readById_Name_Phone(String keyword) {
		logger.info("readById_Name_Phone() 호출");
		return memberDao.memberSelectById_Name_Phone(keyword);
	}

	@Override
	public MemberVO readDetail(MemberVO vo) {
		logger.info("readDetail() 호출");
		return memberDao.memberSelectDetail(vo);
	}

	@Override
	public int create(MemberVO vo) {
		logger.info("create() 호출");
		return memberDao.memberInsert(vo);
	}

	@Override
	public int update(MemberVO vo) {
		logger.info("update() 호출");
		return memberDao.memberUpdate(vo);
	}

	@Override
	public int delete(MemberVO vo) {
		logger.info("delete() 호출");
		return memberDao.memberDelete(vo);
	}

} // end MemberServiceImple
