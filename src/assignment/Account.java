package assignment;

import java.util.Scanner;

public class Account {
	long accno;
	String name;
	double bal;
	public void initAccount() {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter account number");
		accno=s.nextLong();
		System.out.println("Enter account holder name");
		name=s.next();
		System.out.println("Enter balance");
		bal=s.nextDouble();
	}
	public void printdetails() {
		System.out.println("Account number:"+accno);
		System.out.println("Account holder name:"+name);
		System.out.println("Balance:"+bal);
	}
//
//	public static void main(String[] args) {
//		Account a1=new Account();
//		a1.initAccount();
//		a1.printdetails();

	}


