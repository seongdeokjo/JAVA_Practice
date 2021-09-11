package com.bitcamp.sc.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	private int idx;
	private String email;
	private String name;
	private String pw;
	private String phone;

	
	public LoginInfo toLoginInfo() {
		return new LoginInfo(this.idx, this.email, this.name, this.phone);
	}
	
}
