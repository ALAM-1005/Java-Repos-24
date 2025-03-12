package com;

import java.util.*;

public class MaianBank {
	
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		
		Bank b = new BankImpl();  //Upcasting 
		
		b.checkBalance();
		
		
		
		System.out.println("-----------------");
		System.out.println("enter the amount to deposite");
		int amountToDeposite = Scan.nextInt();
		b.Deposite(amountToDeposite);
		b.checkBalance();
		System.out.println("-----------------");
		System.out.println("Enter the amount to be withdrawal");
		
		b.withdraw(Scan.nextInt());
		b.checkBalance();
		System.out.println("-----------------");
		
		b.checkBalance();
	}
	
	

}
