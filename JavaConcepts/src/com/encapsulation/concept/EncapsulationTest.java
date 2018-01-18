package com.encapsulation.concept;

public class EncapsulationTest {
	
	
	private int accountNo=1234;
	private int pinCode=4321;
	private int balance = 10000;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getBalance(int accountNo,int pinCode) {
		if(accountNo==this.accountNo && pinCode==this.pinCode)
		{
		return balance;
		}
		else
		{
			System.out.println("Invalid account no OR password");
			return 0;
		}
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
