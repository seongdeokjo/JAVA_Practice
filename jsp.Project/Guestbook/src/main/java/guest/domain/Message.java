package guest.domain;

import java.sql.Timestamp;
	// 데이터 베이스로 처리하기 위한 클래스
public class Message {
	
	//mysql : guestbook_message table과 일치
	private int memssageid;
	private String guestname;
	private String password;
	private String message;
	private Timestamp regdate;
	
	public Message() {}
	
	//messageRequest와 같은 생성자 생성 : 사용자에게 받은 값의 데이터를 처리 하기위해 db로 
	public Message(String guestname, String password, String message) {
		this.guestname = guestname;
		this.password = password;
		this.message = message;
	}

	public Message(int memssageid, String guestname, String password, String message, Timestamp regdate) {
		this.memssageid = memssageid;
		this.guestname = guestname;
		this.password = password;
		this.message = message;
		this.regdate = regdate;
	}

	public int getMemssageid() {
		return memssageid;
	}

	public void setMemssageid(int memssageid) {
		this.memssageid = memssageid;
	}

	public String getGuestname() {
		return guestname;
	}

	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Message [memssageid=" + memssageid + ", guestname=" + guestname + ", password=" + password
				+ ", message=" + message + ", regdate=" + regdate + "]";
	}
	
	
	
}
