package encapsulation;

public class AccountProgram {

	Account account;
//	linker til Account.java i samme package
	
	void init(){
//		initialverdi og opprettelse av objekt
		account = new Account(1000 ,0.05);
	}
	
	void run(){
//		leser inn input og kaller riktig metode
		account.deposit(5000);
		System.out.println(account);
		account.addInterest();
		System.out.println(account);
		account.withdraw(1000);
		account.setInterestRate(0.04);
		System.out.println(account);
	}
	
	public static void main(String[] args) {
		AccountProgram program = new AccountProgram();
		program.init();
		program.run();
	}

}
