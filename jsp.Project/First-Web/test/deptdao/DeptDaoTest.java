package deptdao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dept.dao.DeptDao;
import dept.domain.Dept;
import jdbc.util.ConnectionProvider;
import jdbc.util.JdbcUtil;

public class DeptDaoTest {
	private DeptDao dao;
	static Connection conn;
	
	Dept dept;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("db 연결");
		conn = ConnectionProvider.getConnection();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("db 연결 해제");
		JdbcUtil.close(conn);
	}

	@Before
	public void setUp() throws Exception {
		dao = DeptDao.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testGetDetpList() {
		System.out.println("deptList test() 메소드 호출");
		List<Dept> list = dao.getDetpList(conn);
		assertNotNull("리스트 생성 확인", list);
		assertSame("값 확인",list.get(4).getDeptno(), 20);
	}

	@Test
	public void testInsertDept() throws SQLException {
		System.out.println("InsertDept test() 메소드 호출");
		int result = dao.insertDept(conn, new Dept(60,"design","seoul"));
		assertEquals("입력 확인", result, 1);
		
	}

	@Test
	public void testDeleteDept() {
		System.out.println("delete test() 메소드 호출");
		int result = dao.deleteDept(conn, 60);
		assertSame("삭제",result, 1);
	}

	@Test
	public void testSelectByDeptno() {
		dept = dao.selectByDeptno(conn, 30);
		assertSame("확인",30 , dept.getDeptno());
	}

	@Test
	public void testUpdateDept() {
		
		int result = dao.updateDept(conn, new Dept(70,"pr","busan"));
		assertSame("변경 처리 확인", result, 1);
	}
}