package test1;
//�θ� Ŭ������ Exception�� ��ӹ޾� ����ڰ� ����(customException)�� Ŭ������ ����� �� �ִ�.
public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String msg) {
        super(msg);
    }
}