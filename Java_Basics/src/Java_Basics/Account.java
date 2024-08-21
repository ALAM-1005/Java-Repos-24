package Java_Basics;

public class Account {
	long AccountNumber;
	double balance;
	String Name;
	Account(){
		this.AccountNumber = 418812000147l;
		this.balance = 1400.00;
		this.Name = "md juned alam";
	}

	public static void main(String[] args) {
		Account a1 = new Account();
		System.out.println("A/c Number:  "+a1.AccountNumber+" and Balance is "+ a1.balance+" of "+ a1.Name);
	}
}
