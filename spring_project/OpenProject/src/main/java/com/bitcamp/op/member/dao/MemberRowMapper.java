package com.bitcamp.op.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bitcamp.op.member.domain.Member;

public class MemberRowMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		Member member = new Member();
		member.setIdx(rs.getInt("memberCode"));
		member.setMemberId(rs.getString("memberId"));
		member.setMemberPw(rs.getString("memberPw"));
		member.setMemberName(rs.getString("memberName"));
		member.setRegDate(rs.getTimestamp("regDate"));
		return null;
	}

}
