package com.bitcamp.sc.mail.service;

import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MailService {
	
	private JavaMailSender mailSender;
	
	private SpringTemplateEngine templateEngine;
	
	// 보내는 사람 이메일
	private static final String FROM_EMAIL ="seongdeok217@gmail.com";
	
	public void mailSend(Map<String,Object> params) throws MessagingException {
		
			MimeMessage message = mailSender.createMimeMessage();
			// 파일 첨부 가능 
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			
			// 메일 제목 
			helper.setSubject("신촌맥주 양조장 투어 예약이 변경되었습니다.");
			// 받는 사람
			helper.setTo((String)params.get("email"));
			// 보내는 사람 
			helper.setFrom(FROM_EMAIL);
			// 내용 
			Context context = new Context();
			context.setVariable("name", (String)params.get("name"));
			context.setVariable("phone", (String)params.get("phone"));
			context.setVariable("people", (String)params.get("people"));
			context.setVariable("newDate", (String)params.get("newDate"));
			// 예약 신청 일시 ?? -> orders table에서 odate 계속 변경??
			// html 경로 가져오기
			String html = templateEngine.process("tour/changeReservation/sendMailChangeDate", context);
			// 가져온 메시지 내용저장
			helper.setText(html, true);
			
	       
			// 메일 전송
	        mailSender.send(message);
	}

}
