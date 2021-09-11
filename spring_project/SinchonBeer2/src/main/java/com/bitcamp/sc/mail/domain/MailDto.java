package com.bitcamp.sc.mail.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailDto {
	private String email;
	private String title;
	private String message;
}
