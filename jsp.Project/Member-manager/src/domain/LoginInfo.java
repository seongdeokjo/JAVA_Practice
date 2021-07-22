package domain;

public class LoginInfo {
	private int memberCode;
	private String memberId;
	private String memberName;
	
	public LoginInfo(int memberCode, String memberId, String memberName) {
		this.memberCode = memberCode;
		this.memberId = memberId;
		this.memberName = memberName;
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

	@Override
	public String toString() {
		return "LoginInfo [memberCode=" + memberCode + ", memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	
	
	
	
}