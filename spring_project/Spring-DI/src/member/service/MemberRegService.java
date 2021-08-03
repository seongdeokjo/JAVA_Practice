package member.service;

import java.util.Date;

import member.dao.Dao;
import member.domain.Member;
import member.domain.RegRequest;

public class MemberRegService {
	
//	Dao dao = new MemberDao(); 
	Dao dao;
	int num;
	
	// setter: [property] 주입방식
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	//정수 데이터를 받는 생성자
		public MemberRegService(int num) {
//			this.dao = dao;
			System.out.println("MeberRegService 인스턴스 생성");
		}
	
	//생성자 주입방식
	public MemberRegService(Dao dao) {
		this.dao = dao;
		System.out.println("MeberRegService 인스턴스 생성");
	}
	
	//생성자 주입방식
		public MemberRegService(Dao dao,int num) {
			this.dao = dao;
			this.num = num;
			System.out.println("MeberRegService 인스턴스 생성");
		}
	
	public void regMember(RegRequest request) throws Exception {
		
		// 중복 이메일 체크
		Member member = dao.selectByEmail(request.getEmail());
		
		if(member != null) {
			throw new Exception("중복 이메일");
		}
		
		
		Member newMember = new Member(
				0,
				request.getEmail(),
				request.getPassword(),
				request.getName(),
				new Date());
		
		dao.insert(newMember);
	}
	
	
}