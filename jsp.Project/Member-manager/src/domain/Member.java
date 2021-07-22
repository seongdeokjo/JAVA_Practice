package domain;

import java.sql.Timestamp;
import java.util.Date;

public class Member {
	
	private int memberCode;
	private String memberId;
	private String memberPw;
	private String memberName;
	private Timestamp regDate;
	
	public Member(int memberCode, String memberId, String memberPw, String memberName, Timestamp regDate) {
		this.memberCode = memberCode;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.regDate = regDate;
	}
	
	public Member() {}

	

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

	public void setmemberPw(String memberPw) {
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
	
	// java.sql.TimeStamp -> java.util.Date
	public Date getDate() {
		return new Date(getRegDate().getTime());
	}

	@Override
	public String toString() {
		return "Member [memberCode=" + memberCode + ", memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", regdate=" + regDate + "]";
	}
	
	// Member -> LoginInfo 
	public LoginInfo toLoginInfo() {
		return new LoginInfo(this.memberCode,this.memberId,this.memberName);
	}
	
	
	
	

}
