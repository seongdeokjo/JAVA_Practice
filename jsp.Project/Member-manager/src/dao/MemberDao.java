package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Member;
import util.JdbcUtil;

public class MemberDao {

	private MemberDao() {
	}

	private static MemberDao dao = new MemberDao();

	public static MemberDao getInstance() {
		return dao;
	}
	//회원가입
	public int insertMember(Connection conn, Member member) {

		int resultCnt = 0;

		PreparedStatement pstmt = null;

		String sql = "insert into project.member (memberId,memberPw,memberName) values (?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultCnt;

	}
	// 회원 리스트 출력
	public List<Member> selectList(Connection conn) {

		List<Member> list = null;

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();

			String sql = "select * from member";

			rs = stmt.executeQuery(sql);

			list = new ArrayList<Member>();

			while (rs.next()) {
				list.add(new Member(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4),
						rs.getTimestamp(5)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}

		return list;

	}
	// 로그인을 위한 db연결
	public Member selectByLogin(Connection conn, String memberId, String memberPw) {
		Member member = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sqlSel = "select * from project.member where memberId=? and memberPw = ? ";
		try {
		pstmt = conn.prepareStatement(sqlSel);
		pstmt.setString(1, memberId);
		pstmt.setString(2, memberPw);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			member = new Member();
			member.setIdx(rs.getInt("memberCode"));
			member.setMemberId(rs.getString("memberId"));
			member.setmemberPw(rs.getString("memberPw"));
			member.setMemberName(rs.getString("memberName"));
			member.setRegDate(rs.getTimestamp("regDate"));
		
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		
		return member;
	}

}
