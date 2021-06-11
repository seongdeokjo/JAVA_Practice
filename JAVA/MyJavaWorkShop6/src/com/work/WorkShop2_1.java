package com.work;
//+++++++++++++++++++++++++++추가 내용++++++++++
//스캐너를 이용해서 생성사 오버로딩 없이 직접 값을 입력하여 해보기
// 값을 계속 받고 입력하고 만들어보기 
class Account {
	private String accountNo;
	private String accountName;
	private double balance;
	public	static double interest ;//공용변수 
	//생성자의 오버로딩 3개의 값 
	public Account(String accountNo, String accountName, double balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
//	public void setAccountNo(String accountNo) {
//		this.accountNo = accountNo;
//	}
	public String getAccountName() {
		return accountName;
	}
//	public void setAccountName(String accountName) {
//		this.accountName = accountName;
//	}
	public double getBalance() {
		return balance;
	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	public void deposit(double a) {
		this.balance += a ; //this.balance = this.balance + a;
	}
	public void withdraw(double b) {
		this.balance -= b;
	}
	public void addInterest() {
	//this 안써도 상관 없음 
	// balance = balance + (balance * interest);
		this.balance += (balance* interest); 
		
	}
}
public class WorkShop2_1 {
	public static void main(String[] args) {
		Account customer1 = new Account("111-222-33333333","최은희",20000);
		Account customer2 = new Account("555-666-77777777","남매월",100000);
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
	
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("이자율의 계산");
		Account.interest = 0.05;
		//addInterest() : 인스턴스 함수
		customer1.addInterest();
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);
	}
	// customer 1,2  레퍼런스 복사 
	static void printAccount(Account customer) {
		System.out.println("계좌번호:"+customer.getAccountNo());
		System.out.println("예금주이름:"+customer.getAccountName());
		System.out.println("잔액:"+customer.getBalance());
		System.out.println();
	}
}
