package test1;
import test1.*;
public class AccountInfo {
	private String name;
	private String account;
	private int balance;
	AccountInfo(String name, String account, int balance) {
		this.setName(name);
		this.account = account;
		this.balance = balance;
	}	
	public void showInfo() throws AccountNotFoundException {
//		if (account == null && name == null && balance == 0) {
//			throw new AccountNotFoundException("[에러] 계좌가 없습니다.");
//		}
		System.out.println("[account]: " + this.account + ", [name]: " + this.getName() + ", [balance] :" + this.balance);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}