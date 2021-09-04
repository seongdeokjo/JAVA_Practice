package com.bitcamp.app.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MemberInfo {

	private int midx;

	private String memail;
	private String mname;

	private String mpw;
	private String mphone;
	
	public boolean matchPassword(String mpw) {
		return this.mpw.equals(mpw);
	}

}
