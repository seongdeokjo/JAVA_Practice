package com.test1;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		boolean result = service.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			service.logout("hong");
		}else {
			System.out.println("id �Ǵ� pass�� �ùٸ��� �ʽ��ϴ�.");
			
		}
	}

}
