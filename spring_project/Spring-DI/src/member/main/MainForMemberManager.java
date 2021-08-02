package member.main;

import java.util.Scanner;

import member.domain.RegRequest;
import member.service.ChangePasswordService;
import member.service.MemberRegService;

public class MainForMemberManager {

	static Assembler assembler = new Assembler(); 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		while(true) {
			printMenu();
			
			String command = scan.nextLine();
			//프로그램의 종료 분기
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				scan.close();
				return;
			}
			
			if(command.startsWith("new")) {
				String[] values = command.split(" ");
				// values[0] => king@gamil.com
				processNewMember(values);
				continue;
			}
			
			if(command.startsWith("change")) {
				String[] values = command.split(" ");
				processChangePw(values);
				continue;
			}
			
		}
		
		
	}
	
	private static void processChangePw(String[] values) {
		
		ChangePasswordService service = assembler.getPasswordService();
		
		try {
			service.changePassword(values[1], values[2], values[3]);
			
			System.out.println("비밀번호를 변경했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		}
		
	}

	private static void processNewMember(String[] values) {
		// MemberRegService 이용해서 정보 저장
		
		MemberRegService service = assembler.getRegService();
		RegRequest request = new RegRequest();
		
		request.setEmail(values[1]);
		request.setName(values[2]);
		request.setPassword(values[3]);
		request.setConfirmPassword(values[4]);
		
		if(!request.isPasswordEqualToConfirmPassword()) {
			System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
			return;
		}
		
		try {
			service.regMember(request);
			
			System.out.println("등록되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

	static void printMenu() {
		System.out.println();
		System.out.println("명령어 사용법");
		System.out.println("-----------------------------------");
		System.out.println("new 이메일 이름 비밀번호 비밀번호확인");
		System.out.println("new king@gmail.com king 1234 1234");
		System.out.println("회원 수정------------------------------");
		System.out.println("change 이메일 현재비번 새로운비번");
		System.out.println("change king@gmail.com 1234 1111");
		System.out.println("------------------------------------");
	}
	
	
}
