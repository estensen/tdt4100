package stateandbehavior;

import java.util.Scanner;

public class RPNCalcProgram {

	private RPNCalc superkalkulator;
	private Scanner input;
	
	private void init() {
		superkalkulator = new RPNCalc();
		input = new Scanner(System.in);
	}
	
	private void run() {
		System.out.println("Welcome to the Reverse Polish notation calculator");
		while(true) {
			String line = input.nextLine();
			if (line.equals("+") || line.equals("-") || line.equalsIgnoreCase("*") || line.equals("/") || line.equals("~")) {
				superkalkulator.performOperation(line.charAt(0));
				System.out.println(superkalkulator.peek(0));
			}
			else if (line.matches("[0-9]+")) {
				superkalkulator.push(Double.parseDouble(line));
			}
//			else if (line.equals("stack")) {
//				System.out.println(superkalkulator.stack());
//			}
			else if (line.equals("exit")) {
				break;
			}
			
			else {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		RPNCalcProgram program = new RPNCalcProgram();
		program.init();
		program.run();
//		superkalkulator.push(2);
//		superkalkulator.push(3);
//		superkalkulator.performOperation('+');
//		System.out.println(superkalkulator.peek(0));
	}
}