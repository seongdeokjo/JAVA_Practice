package com.bitcamp.sc.member.repository;

import org.apache.ibatis.annotations.Insert;

import com.bitcamp.sc.member.domain.Member;
import com.bitcamp.sc.member.domain.MemberAddress;

public interface MemberDao {

	//로그인 하기
	Member selectByEmailPw(String email, String pw);
	//이메일로 회원정보 불러오기
	Member selectByEmail(String email);
	//회원가입
	int insertMember(Member member);
	//이메일(아이디) 중복 체크
	int selectByEmail2(String email);
	
	//회원 주소 입력
	@Insert("insert into address (midx, postcode, address1, address2) values(#{midx}, #{postcode}, #{address1}, #{address2})")
	int insertAddress(MemberAddress memberAddress);
	
	//이메일 찾기 (멤버 객체)
	public Member emailSearch(String name, String phone);

	//비밀번호 찾기 (멤버 객체)
	public Member pwSearch(String name, String email);
}
