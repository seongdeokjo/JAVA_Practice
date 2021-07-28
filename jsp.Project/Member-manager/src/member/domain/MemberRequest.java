package member.domain;

public class MemberRequest {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPhoto;
	
	public MemberRequest() {
	}


	public MemberRequest(String memberId,String memberPw ,String memberName,String memberPhoto) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhoto = memberPhoto;
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
	
	public String getMemberPhoto() {
		return memberPhoto;
	}


	public void setMemberPhoto(String memberPhoto) {
		this.memberPhoto = memberPhoto;
	}


	public Member toMember() {
		return new Member(memberId,memberPw,memberName,memberPhoto);
	}

	@Override
	public String toString() {
		return "LoginInfo [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + "]";
	}

}
