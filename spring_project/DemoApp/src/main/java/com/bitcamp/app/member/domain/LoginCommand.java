package com.bitcamp.app.member.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginCommand {
//	LoginCommand 클래스 - 로그인 폼에 입력된 값을 담을 커맨드 클래스

	private String memail;
	private String mpw;
}
