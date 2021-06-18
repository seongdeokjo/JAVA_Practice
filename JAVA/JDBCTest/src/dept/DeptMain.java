package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		Connection conn = null;
		//1. ����̹� �ε�
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			System.out.println("����̹� �ε� ����!");
			
			//2. ���� -> �߿�  ������ ����غ��� !
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("�����ͺ��̽� ���� ����!!");
				
			DeptDao dao = new DeptDao();
			
			List<Dept> list = dao.getDeptList(conn);
			
		/*	for(Dept dept : list) {
				System.out.println(dept);
			} 
		*/
		Scanner scan = new Scanner(System.in);
		
	/*	System.out.println("�μ��Է��� �����մϴ�.");
		System.out.println("�μ���ȣ �μ��̸� �μ���ġ ������ �Է����ּ���.");
		System.out.println("��) 50 dev seoul");
		String deptData = scan.nextLine();
		String[] deptDatas = deptData.split(" ");
		
		//Dept ��ü ���� -> Dao �޼ҵ� ȣ�� 
		Dept dept = new Dept(Integer.parseInt(deptDatas[0]), deptDatas[1], deptDatas[2]);	
		
		int result = dao.insertDept(conn, dept);
		if(result > 0) {
			System.out.println("�Է� ����!");
		}else {
			System.out.println("�Է� ����");
		}*/
		
		
		System.out.println("�μ������� �����մϴ�.");
		System.out.println("�����ϰ����ϴ� �μ���ȣ ���μ��̸�  ���μ���ġ ������ �Է����ּ���.");
		System.out.println("��) 50 dev seoul");
		String deptData = scan.nextLine();
		String[] deptDatas = deptData.split(" ");
		
		//Dept ��ü ���� -> Dao �޼ҵ� ȣ�� 
		Dept dept = new Dept(Integer.parseInt(deptDatas[0]), deptDatas[1], deptDatas[2]);	
		
		int result = dao.editDept(conn, dept);
		if(result > 0) {
			System.out.println("���� ����!");
		}else {
			System.out.println("���� ����");
		}
		
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
	}
}
}
