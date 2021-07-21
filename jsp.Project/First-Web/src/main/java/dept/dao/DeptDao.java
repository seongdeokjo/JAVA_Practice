package dept.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dept.domain.Dept;
import jdbc.util.jdbcUtil;

public class DeptDao {

	public List<Dept> getDetpList(Connection conn) {
		List<Dept> deptList = null;

		Statement stmt = null;
		ResultSet rs = null;
		// 3.Statement
		try {
			stmt = conn.createStatement();
			// sql
			String sqlSelect = "select * from dept";

			// 4.ResultSet
			rs = stmt.executeQuery(sqlSelect);

			// 5.List<Dept> <- 결과
			deptList = new ArrayList<Dept>();

			while (rs.next()) {
				// List에 객체 추가
				deptList.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.close(rs);
			jdbcUtil.close(stmt);
		}
		return deptList;
	}
}