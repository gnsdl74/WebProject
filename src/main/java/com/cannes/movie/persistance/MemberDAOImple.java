package com.cannes.movie.persistance;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cannes.movie.domain.MemberVO;

@Repository
public class MemberDAOImple implements MemberDAO {
	private static final String NAMESPACE =
			"com.cannes.movie.MemberMapper";
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOImple.class);
	
	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<MemberVO> memberSelectAll() {
		logger.info("memberSelectAll() 호출");
		return sqlsession.selectList(NAMESPACE + ".memberSelectAll");
	} // end memberSelectAll()

	@Override
	public List<MemberVO> memberSelectById_Name_Phone(String keyword) {
		logger.info("memberSelectById_Name_Phone() 호출");
		keyword = "%" + keyword + "%";
		return sqlsession.selectList(NAMESPACE + ".memberSelectById_Name_Phone", keyword);
	} // end memberSelectById_Name_Phone

	@Override
	public MemberVO memberSelectDetail(MemberVO vo) {
		logger.info("memberSelectDetail() 호출");
		return sqlsession.selectOne(NAMESPACE + ".memberSelectDetail", vo);
	} // end memberSelectById_Pw

	@Override
	public int memberInsert(MemberVO vo) {
		logger.info("memberInsert() 호출");
		return sqlsession.insert(NAMESPACE + ".memberInsert", vo);
	} // end memberInsert()

	@Override
	public int memberUpdate(MemberVO vo) {
		logger.info("memberUpdate() 호출");
		return sqlsession.update(NAMESPACE + ".memberUpdate", vo);
	} // end memberUpdate()

	@Override
	public int memberDelete(MemberVO vo) {
		logger.info("memberDelete() 호출");
		return sqlsession.delete(NAMESPACE + ".memberDelete", vo);
	} // end memberDelete()

} // end MemberDAOImple
