package guest.exception;

public class InvaildPasswordException extends Exception {

	public InvaildPasswordException() {
		super("비밀번호가 일치하지 않습니다.");
	}
	
}
