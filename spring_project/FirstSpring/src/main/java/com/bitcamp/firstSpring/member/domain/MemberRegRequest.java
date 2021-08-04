package com.bitcamp.firstSpring.member.domain;

public class MemberRegRequest {
	private String memberId;
	private String memberPw;
	private String memberName;
//	private String memberPhoto;
	
	public MemberRegRequest() {
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

//	public String getMemberPhoto() {
//		return memberPhoto;
//	}
//
//	public void setMemberPhoto(String memberPhoto) {
//		this.memberPhoto = memberPhoto;
//	}

	@Override
	public String toString() {
		return "MemberRegRequest [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+"]"; 
//				", memberPhoto=" + memberPhoto + "]";
	}
	
	
	
	
	
	
}
