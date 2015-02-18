package programs;

public class Account {

	public double balance;
	public double interestRate;
	
	public String toString() {
		return String.format("[Account balance=%f interestRate=%f", balance, interestRate);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}
	
	public void addInterest() {
		deposit(balance * interestRate / 100);		
	}
}

