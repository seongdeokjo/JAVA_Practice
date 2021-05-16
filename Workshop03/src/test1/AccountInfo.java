package test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import test1.*;
public class AccountInfo {
	private String name;
	private String account;
	private int balance;
	AccountInfo(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	public void create() throws InvalidValueException {
		System.out.print(" 계좌번호 : ");
		account = getUserInput();
		System.out.print("예금주 : ");
		name = getUserInput();
		System.out.print("최초입금 :");
		balance = Integer.parseInt(getUserInput());
		if (balance <= 0) {
			throw new InvalidValueException("[에러] 최초금액은 0원 이상입니다.");
		}
		new AccountInfo(account, name, balance);
		System.out.println("입력이 완료되었습니다.");
	}
	public void deposit() throws InvalidValueException {
		System.out.print("입금할 금액을 입력하세요.");
		int money = Integer.parseInt(getUserInput());
		if (money <= 0) {
			throw new InvalidValueException("최소 금액은 0원 이상입니다.");
		}
		this.balance += money;
		System.out.println(money + " 원 정상입금되었습니다.");
	}
	public void withdraw() throws InvalidValueException {
		// TODO 출금할 금액이 잘못 입력되었거나, 잔액이 부족한 경우 예외 발생
		System.out.print("출금할 금액을 입력하세요.");
		int money = Integer.parseInt(getUserInput());
		if (balance < money) {
			throw new InvalidValueException("[에러]!! 잔고 부족 :" + (money - balance) + " 원모자람");
		}
		if (money < 0) {
			throw new InvalidValueException("[에러]!! 출금할 금액은 0원 초과로 입력해");
		}
		this.balance -= money;
		System.out.println(money + "원 정상 출금되었습니다.");
	}
	public static String getUserInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = null;
		try {
			inputString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputString;
	}
	public void showInfo() throws AccountNotFoundException {
		if (account == null && name == null && balance == 0) {
			throw new AccountNotFoundException("[에러] 계좌가 없습니다.");
		}
		System.out.println("[account]: " + account + ", [name]: " + name + ", [balance] :" + balance);
	}
}