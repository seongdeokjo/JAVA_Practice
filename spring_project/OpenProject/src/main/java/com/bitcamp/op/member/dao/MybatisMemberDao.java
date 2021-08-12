package com.bitcamp.op.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.op.jdbc.JdbcUtil;
import com.bitcamp.op.member.domain.Member;
import com.bitcamp.op.member.domain.SearchIdPw;

@Repository
public class MybatisMemberDao {

	@Autowired
	private SqlSessionTemplate template;
	
	private final String NAME_SPACE = "com.bitcamp.op.member.dao.memberMapper";
	
	// dml -> update method 사용
	// 회원가입
	public int insertMember(Member member) throws SQLException{
		
		return template.update(NAME_SPACE+".insertMember", member);	
	}

	public int insertMember1(final Member member) {
		int resultCnt = 0;
		
//		// 자동 증가한 컬럼의 값을 저장할 객체
//		KeyHolder holder = new GeneratedKeyHolder();
//
//		resultCnt = template.update(new PreparedStatementCreator() {
//
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				String sql2 = "insert into member (memberId,memberPw,memberName,memberPhoto) values (?, ?, ?,?)";
//				PreparedStatement pstmt = con.prepareStatement(sql2, new String[] { "memberCode" });
//				pstmt.setString(1, member.getMemberId());
//				pstmt.setString(2, member.getMemberPw());
//				pstmt.setString(3, member.getMemberName());
//				pstmt.setString(4, member.getMemberPhoto());
//
//				return pstmt;
//			}
//
//		}, holder);
//		Number idx = holder.getKey();
//		member.setIdx(idx.intValue());

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
	public Member selectByIdPw(String memberid, String memberpw) {
		
	Member member =	template.selectOne(NAME_SPACE+".selectByIdPw", new SearchIdPw(memberid,memberpw));
		
		return member;
	}
	// id 중복여부 확인을 위한 id 값으로 검색 => 개수 반환
	public int selectById(String memberId) throws SQLException {
		
		return template.selectOne(NAME_SPACE+".selectById", memberId);
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