package com.work;
//import com.work.Account;
//+++++++++++++++++++++++++++�߰� ����++++++++++
//��ĳ�ʸ� �̿��ؼ� ������ �����ε� ���� ���� ���� �Է��Ͽ� �غ���
// ���� ��� �ް� �Է��ϰ� ������ 
class Account2 {
	private String accountNo;
	private String accountName;
	private double balance;
	public	static double interest ;//���뺯�� 
	//�������� �����ε� 3���� �� 
	public Account2() {
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
	//this �Ƚᵵ ��� ���� 
	// balance = balance + (balance * interest);
		this.balance += (balance* interest); 
		
	}
}
public class WorkShop2_1_1 {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++");
		System.out.println("");
		Account2 customer1 = new Account2();
		Account2 customer2 = new Account2();
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
	
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("�������� ���");
		Account.interest = 0.05;
		//addInterest() : �ν��Ͻ� �Լ�
		customer1.addInterest();
		customer2.addInterest();
		printAccount(customer1);
		printAccount(customer2);
	}
	// customer 1,2  ���۷��� ���� 
	static void printAccount(Account2 customer) {
		System.out.println("���¹�ȣ:"+customer.getAccountNo());
		System.out.println("�������̸�:"+customer.getAccountName());
		System.out.println("�ܾ�:"+customer.getBalance());
		System.out.println();
	}
}
