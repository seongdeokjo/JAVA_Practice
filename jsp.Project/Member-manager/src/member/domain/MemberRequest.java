package member.domain;

public class MemberRequest {
	private String memberId;
	private String memberPw;
	private String memberName;

	public MemberRequest(String memberId,String memberPw ,String memberName) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
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
	
	public Member toMember() {
		return new Member(memberId,memberPw,memberName);
	}

	@Override
	public String toString() {
		return "LoginInfo [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + "]";
	}

}
