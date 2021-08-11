package com.bitcamp.op.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitcamp.op.jdbc.JdbcUtil;
import com.bitcamp.op.member.domain.Member;

@Repository
public class JdbcTemplateMemberDao {
	
	@Autowired
	private JdbcTemplate template;
	

	// 회원가입
	public int insertMember(Connection conn, Member member) {

		int resultCnt = 0;

		PreparedStatement pstmt = null;

		String sql1 = "insert into member (memberId,memberPw,memberName) values (?, ?, ?)";
		String sql2 = "insert into member (memberId,memberPw,memberName,memberPhoto) values (?, ?, ?,?)";

		try {
			if (member.getMemberPhoto() == null) {
				pstmt = conn.prepareStatement(sql1);
				pstmt.setString(1, member.getMemberId());
				pstmt.setString(2, member.getMemberPw());
				pstmt.setString(3, member.getMemberName());
			} else {
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, member.getMemberId());
				pstmt.setString(2, member.getMemberPw());
				pstmt.setString(3, member.getMemberName());
				pstmt.setString(4, member.getMemberPhoto());
			}

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}

		return resultCnt;

	}

	// 회원 리스트 출력

	public List<Member> selectList(Connection conn) throws SQLException {

		List<Member> list = null;

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();

			String sql = "select * from member";

			rs = stmt.executeQuery(sql);

			list = new ArrayList<Member>();

			while (rs.next()) {
				list.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getTimestamp(6)));
			}

		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}

		return list;

	}

	// 로그인을 위한 db연결
	public Member selectByLogin(Connection conn, String memberid, String memberpw) {
		Member member = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sqlSel = "select * from project.member where memberId=? and memberPw = ? ";
		try {
			pstmt = conn.prepareStatement(sqlSel);
			pstmt.setString(1, memberid);
			pstmt.setString(2, memberpw);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member();
				member.setIdx(rs.getInt("memberCode"));
				member.setMemberId(rs.getString("memberId"));
				member.setMemberPw(rs.getString("memberPw"));
				member.setMemberName(rs.getString("memberName"));
				member.setRegDate(rs.getTimestamp("regDate"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}

		return member;
	}
	// id 중복여부 확인을 위한 id 값으로 검색 => 개수 반환

	public int selectById(Connection conn, String memberId) throws SQLException {
		int cnt = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select count(*) from member where memberId = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt(1);
			}
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return cnt;
	}

	// 회원의 정보를 변경하는 db
	public int editMember(Connection conn, Member member) {
		int result = 0;

		PreparedStatement pstmt = null;

		String sql1 = "update member set memberPw =?, memberName = ? where memberId = ?";
		String sql2 = "update member set memberPw =?, memberName = ? memberPhoto = ? where memberId = ?";

		try {
			if (member.getMemberPhoto() == null) {
				pstmt = conn.prepareStatement(sql1);
				pstmt.setString(1, member.getMemberPw());
				pstmt.setString(2, member.getMemberName());
				pstmt.setString(3, member.getMemberId());
			} else {
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, member.getMemberPw());
				pstmt.setString(2, member.getMemberName());
				pstmt.setString(3, member.getMemberPhoto());
				pstmt.setString(4, member.getMemberId());
			}

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		return result;
	}

	public int delMember(Connection conn, String code) {
		int result = 0;

		PreparedStatement pstmt = null;
		String sql = "delete from member where memberCode = ? ";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		return result;
	}

}