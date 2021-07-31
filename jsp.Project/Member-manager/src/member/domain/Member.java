package member.domain;

import java.sql.Timestamp;
import java.util.Date;

public class Member {
	
	private int memberCode;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPhoto;
	private Timestamp regDate;
	
	public Member() {}
	
	public Member(String memberId, String memberPw, String memberName,String memberPhoto) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhoto = memberPhoto;
	}

	
	public Member(int memberCode, String memberId, String memberPw, String memberName,String memberPhoto, Timestamp regDate) {
		this.memberCode = memberCode;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhoto = memberPhoto;
		this.regDate = regDate;
	}
	
	public int getMemberCode() {
		return memberCode;
	}

	public void setIdx(int memberCode) {
		this.memberCode = memberCode;
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

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	public String getMemberPhoto() {
		return memberPhoto;
	}

	public void setMemberPhoto(String memberPhoto) {
		this.memberPhoto = memberPhoto;
	}

	// java.sql.TimeStamp -> java.util.Date
	public Date getDate() {
		return new Date(getRegDate().getTime());
	}


	@Override
	public String toString() {
		return "Member [memberCode=" + memberCode + ", memberId=" + memberId + ", memberPw=" + memberPw
				+ ", memberName=" + memberName + ", memberPhoto=" + memberPhoto + ", regDate=" + regDate + "]";
	}

	// Member -> LoginInfo 
	public LoginInfo toLoginInfo() {
		return new LoginInfo(this.memberCode,this.memberId,this.memberName);
	}

}