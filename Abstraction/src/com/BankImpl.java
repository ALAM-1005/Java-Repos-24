package com;

class BankImpl implements Bank{
	
	int balance = 5000;
	
	@Override
	public void Deposite(int amount) {
		
		System.out.println("Depositing ₹"+amount);
		balance += amount;
		System.out.println("Amount is deposited Successfully!");
		
		
	}
	@Override
	public void withdraw(int amount) {
		
		System.out.println("Withdrawing ₹"+amount);
		balance -= amount;
		System.out.println("Amount is Withdrawn Successfully!");
		
		
	}
	
	@Override
	public void checkBalance() {
		
		System.out.println("Available balance ₹"+balance);
		
	}

}
