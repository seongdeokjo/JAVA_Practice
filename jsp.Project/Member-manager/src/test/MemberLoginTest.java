package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import member.dao.MemberDao;
import member.domain.Member;
import member.util.ConnectionProvider;

class MemberLoginTest {
	static Connection conn;
	static MemberDao dao;
	Member member;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = MemberDao.getInstance();
		conn = ConnectionProvider.getConnection();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSelectByLoginConnectionStringString() {
		String id = "member33";
		String pw = "12";
		member = dao.selectByLogin(conn, id,pw);
		assertEquals("member 테스트", "1234", member.getMemberPw());
		
	}

}
