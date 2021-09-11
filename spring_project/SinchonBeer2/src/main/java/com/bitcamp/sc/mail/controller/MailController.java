package com.bitcamp.sc.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.sc.mail.domain.MailDto;
import com.bitcamp.sc.mail.service.MailService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/mail")
public class MailController {

	private final MailService mailService;

	@RequestMapping(method = RequestMethod.GET)
	public String getMailForm() {
		return "mail/mailForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String execMail(MailDto mailDto) {
		mailService.mailSend(mailDto);
		return "mail/mailForm";
	}
}
