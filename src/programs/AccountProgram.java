package programs;

import java.util.Scanner;

public class AccountProgram {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		
		System.out.println("Velkommen! Legg til med deposit, sett rente med setInterest, addInterest, sjekk balanse med balance.");
		
		while(scanner.hasNextLine()){
			
			String[] input = scanner.nextLine().split(" ");
			
			if(input[0].equals("deposit")){
				int amount = Integer.valueOf(input[1]);
				account.deposit(amount);
			}
			else if(input[0].equals("setInterest")){
				int interest = Integer.valueOf(input[1]);
				account.interestRate = interest;
			}
			else if(input[0].equals("addInterest")){
				account.addInterest();
			}
			else if(input[0].equals("balance")){
				System.out.println("Balansen er " + account.balance);
			}
			
		}
		
	}
	
	
}
