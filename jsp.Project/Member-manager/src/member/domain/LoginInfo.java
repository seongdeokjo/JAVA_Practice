package member.domain;

public class LoginInfo {
	private int memberCode;
	private String memberId;
	private String memberName;
	private String memberPhoto;
	
	public LoginInfo(int memberCode, String memberId, String memberName,String memberPhoto) {
		this.memberCode = memberCode;
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhoto = memberPhoto;
	}

	public int getMemberCode() {
		return memberCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberPhoto() {
		return memberPhoto;
	}

	@Override
	public String toString() {
		return "LoginInfo [memberCode=" + memberCode + ", memberId=" + memberId + ", memberName=" + memberName
				+ ", memberPhoto=" + memberPhoto + "]";
	}
		
}
