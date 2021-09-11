package com.bitcamp.sc.mail.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.bitcamp.sc.mail.domain.MailDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MailService {
	
	private JavaMailSender mailSender;
	// 보내는 사람 이메일
	private static final String FROM_EMAIL ="seongdeok217@gmail.com";
	
	
	public void mailSend(MailDto mailDto) {
		
		  SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(mailDto.getEmail());
	        message.setFrom(MailService.FROM_EMAIL);
	        message.setSubject(mailDto.getTitle());
	        message.setText(mailDto.getMessage());

	        mailSender.send(message);
	}

}
