package encapsulation;

public class Account {
	private double balance;
	private double interestRate;
//	oppretter klassen Account med variablene balance og interestRate
	
//	public Account() {
////		for at JExercise skal fungere ...
//	}
	
//	Account(double, double) - Konstruktøren skal ta inn startbeløpet og rentefoten (prosentpoeng). Ingen av disse kan være negative.
//	double getBalance() - Returnerer beløpet som står på kontoen.
//	double getInterestRate() - Returnerer renten på kontoen.
//	void setInterestRate(double) - Denne metoden tar inn en ikke-negativ verdi og setter renten til denne verdien.
//	void deposit(double) - Denne metoden tar inn et ikke-negativt beløp og øker konto-beløpet tilsvarende.
//	void withdraw(double) - Denne metoden tar inn et ikke-negativt beløp og minsker konto-beløpet tilsvarende. Dersom det nye konto-beløpet er negativt, så skal tilstanden ikke endre, og det skal utløses et unntak av typen IllegalStateException.
	
	
	
	
	public Account(double tempBalance, double tempInterestRate){
//		konstruktør som setter startparametre
		if (tempBalance < 0 || tempInterestRate < 0) {
			throw new IllegalArgumentException("Balance and interestrate must be positive");
//			sørger for at negativ startbeløp eller rentepfot ikke godtas
		}
		else {
			balance = tempBalance;
			interestRate = tempInterestRate;
//			gir verdier til objektene interetsRate og balance 
		}
	}
	
	public void deposit(double depositAmount){
//		metoden øker konto-beløpet med den angitte argument-verdien (et desimaltall), men kun dersom det er positivt
		if (depositAmount > 0){
			balance += depositAmount;
		}
		else {
			throw new IllegalArgumentException("Set a positiv value.");
		}
	}
	
	void withdraw(double withdrawAmount) {
//		Illegal if balance => negative
		if (balance - withdrawAmount > 0) {
			balance -= withdrawAmount;
		}
		else {
			throw new IllegalStateException("You don't have that much money.");
		}
		
	}	
	
	public void addInterest(){
//		beregner renta og legger det til konto-beløpet
		balance += (interestRate*balance);
	}
	
	double getBalance() {
		return balance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	
	void setInterestRate(double newInterestRate) {
		if (newInterestRate < 0) {
			throw new IllegalArgumentException("Interestrate must be positive ");
		}
		else {
			interestRate = newInterestRate;			
		}
	}

	
	public static void main(String[] args) {
		Account myBankAccount = new Account(5000,0.05);
		myBankAccount.deposit(1000);
		System.out.println(myBankAccount.balance);
		System.out.println(myBankAccount.interestRate);
		myBankAccount.addInterest();
		myBankAccount.setInterestRate(0.04);
		System.out.println(myBankAccount.balance);
		System.out.println(myBankAccount.interestRate);
		myBankAccount.withdraw(1000);
		System.out.println(myBankAccount.balance);
		System.out.println(myBankAccount.interestRate);
	}
	
}
