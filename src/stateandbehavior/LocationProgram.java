package stateandbehavior;

import java.util.Scanner;

public class LocationProgram {
	
	private Location location;
	private Scanner input;
	
	void init() {
		location = new Location();
		input = new Scanner(System.in);
	}
	
	void run() {
		System.out.println("You are at x=0, y=0");
		System.out.println("Where would you like to go? (\"exit\" to quit)");
		while (true) {
			String line = input.nextLine();
			if (line.equals("up")) {
				location.up();
			}
			else if (line.equals("down")) {
				location.down();
			}
			else if (line.equals("left")) {
				location.left();
			}
			else if (line.equals("right")) {
				location.right();
			}
			else if (line.equals("position")) {
				System.out.println("X pos: " + location.getX());
				System.out.println("Y pos: " + location.getY());
			}
			else if (line.equals("exit")) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		LocationProgram program = new LocationProgram();
		program.init();
		program.run();
	}

}
