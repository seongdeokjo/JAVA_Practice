package member.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import member.dao.Dao;
import member.service.ChangePasswordService;
import member.service.MemberRegService;

public class SpringMain2 {

	static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// 설정파일을 읽어서 컨테이너로 만듬
		//ctx = new GenericXmlApplicationContext("classpath:appCtx1.xml");
//		ctx = new GenericXmlApplicationContext("classpath:appCtx2.xml");
		ctx = new GenericXmlApplicationContext("classpath:appCtx3.xml");
		
		//MemberRegService 객체를 컨테이너로부터 받아온다.
		
		Dao dao1 = ctx.getBean("memberDao", Dao.class);
		Dao dao2 = ctx.getBean("memberDao", Dao.class);
		
		System.out.println("dao1==dao2"+(dao1==dao2));
		
		MemberRegService regService1 = ctx.getBean("regService", MemberRegService.class);
		MemberRegService regService2 = ctx.getBean("regService", MemberRegService.class);
		
		System.out.println("regService1 == regService2 : "+regService1+regService2);
		
		ChangePasswordService passwordService1 = ctx.getBean("changePasssword",ChangePasswordService.class);
		ChangePasswordService passwordService2 = ctx.getBean("changePasssword",ChangePasswordService.class);
		
		System.out.println("passwordService1 == passwordService2" + (passwordService1 == passwordService2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	