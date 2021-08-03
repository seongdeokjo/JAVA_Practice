package member.service;

import java.util.Date;

import member.dao.Dao;
import member.domain.Member;
import member.domain.RegRequest;

public class MemberRegService {

//	Dao dao = new MemberDao(); 
	private Dao dao;
	private int num;

	// property 주입방식 : setter 메소드를 이용, 기본생성자가 필요
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	// 생성자 정의
	// 기본 생성자
	public MemberRegService() {
		System.out.println("MemberRegService() 기본 생성자");
	}

	// 정수 데이터를 받는 생성자
	public MemberRegService(int num) {
		this.num = num;
		System.out.println("MeberRegService 인스턴스 생성");
	}

	// 생성자 주입방식 : 참조형 타입
	public MemberRegService(Dao dao) {
		this.dao = dao;
		System.out.println("MeberRegService 인스턴스 생성");
	}

	// 생성자 주입방식 : 참조형 + 기본형 타입
	public MemberRegService(Dao dao, int num) {
		this.dao = dao;
		this.num = num;
		System.out.println("MeberRegService 인스턴스 생성");
	}
	/////////////////////////////////////////////////////////////////////

	public void regMember(RegRequest request) throws Exception {

		// 중복 이메일 체크
		Member member = dao.selectByEmail(request.getEmail());

		if (member != null) {
			throw new Exception("중복 이메일");
		}

		Member newMember = new Member(0, request.getEmail(), request.getPassword(), request.getName(), new Date());

		dao.insert(newMember);
	}

}