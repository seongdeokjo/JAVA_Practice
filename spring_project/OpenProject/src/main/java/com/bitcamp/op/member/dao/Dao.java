package com.bitcamp.op.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.bitcamp.op.member.domain.Member;

public interface Dao {
	
	Member selectByIdPw(String id,String pw);
	// 아이디 체크
	int selectById(String memberid);
	// 회원가입
	int insertMember(Member member) throws SQLException;
	// 회원 정보 수정
	int updateMember(Member member);
	// 회원 정보 삭제
	int deleteMember(int memberCode);
	//회원 전체 리스트
	List<Member> selectAll();
	//페이징 처리가 가능한 리스트
	List<Member> selectList(int startRow, int count); // (0,3)
	// 전체 회원의 수
	int selectTotalCount();
	
}
