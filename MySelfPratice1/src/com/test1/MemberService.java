package com.test1;
public class MemberService {
//	String id = "hong";
//	String pass = "12345";
	public boolean login(String id, String pass) {
//		if(this.id == id && this.pass==pass) {
		if(id.equals("hong") &&pass.equals("12345")) {			
			return true;
		}
			return false;
	}
	public void logout(String id) {	
			System.out.println("로그아웃되었습니다.");
	}
}


