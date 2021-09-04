package com.bitcamp.app.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class AuthInfo {
	// 로그인 성공 후  인증 상태를 세션에 보관할 때 사용
	private int midx;
	private String memail;
}
