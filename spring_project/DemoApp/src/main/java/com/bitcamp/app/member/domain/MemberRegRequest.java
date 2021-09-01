package com.bitcamp.app.member.domain;

import org.springframework.web.multipart.MultipartFile;

public class MemberRegRequest {
	private String memberid;
	private String memberpw;
	private String membername;
	private MultipartFile memberphoto;

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getMemberpw() {
		return memberpw;
	}

	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public MultipartFile getMemberphoto() {
		return memberphoto;
	}

	public void setMemberphoto(MultipartFile memberphoto) {
		this.memberphoto = memberphoto;
	}

	public Member toMember() {
		return new Member(0, this.memberid, this.memberpw, this.membername, null, null);
	}

	@Override
	public String toString() {
		return "MemberRegRequest [memberid=" + memberid + ", memberpw=" + memberpw + ", membername=" + membername
				+ ", memberphoto=" + memberphoto + "]";
	}
	
	

}