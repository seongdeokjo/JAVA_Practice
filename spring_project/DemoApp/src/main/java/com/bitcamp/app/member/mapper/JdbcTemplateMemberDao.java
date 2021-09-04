package com.bitcamp.app.member.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.member.domain.MemberInfo;
@Repository
public class JdbcTemplateMemberDao implements MemberMapper {

	private JdbcTemplate template;
	public JdbcTemplateMemberDao(DataSource dateSource) {
		this.template = new JdbcTemplate(dateSource);
	}
	@Override
	public MemberInfo selectByEmail(String memail) {
		List<MemberInfo> results = template.query(
				"select * from member where memail = ?",
				new RowMapper<MemberInfo>() {
					public MemberInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
						MemberInfo member = new MemberInfo(rs.getInt("midx"),
														   rs.getString("memail"),
														   rs.getString("mname"),
														   rs.getNString("mpw"),
														   rs.getNString("mphone")
								);
						return member;
					}
				},memail);
		return results.isEmpty() ? null : results.get(0);
	}
	
	
	
	
}
