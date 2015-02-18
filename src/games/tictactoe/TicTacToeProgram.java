package games.tictactoe;

import java.util.Scanner;

public class TicTacToeProgram {
	
	private Scanner input;
	private TicTacToe game;
	
	void init() {
		input = new Scanner(System.in);
		game = new TicTacToe();

	}
	
	void run() {
		System.out.println("Welcome to tic tac toe");
		System.out.println("Enter x and y coordinates according to the corresponding board positions:");
		System.out.println(" 0 0 | 1 0 | 2 0");
		System.out.println("-----------------");
		System.out.println(" 0 1 | 1 1 | 2 1");
		System.out.println("-----------------");
		System.out.println(" 0 2 | 1 2 | 2 2");
		System.out.println("##################");
		System.out.println();
		System.out.println(game);
		while (true) {
			
			System.out.println("Player " + game.getCurrentPlayerMark() + ", enter position of desired move:");				
			String line = input.nextLine();
			if (line.matches("[0-2][ ][0-2]") && game.isValidMove(Integer.parseInt(line.substring(0,1)),Integer.parseInt(line.substring(2,3))) == true) {
				game.placeMark(Integer.parseInt(line.substring(0,1)),Integer.parseInt(line.substring(2,3)));
				System.out.println(game);
				if (game.checkForWin() == true) {
					System.out.println("We have a winner!");
					break;
				}
				else if (game.isFull() == true) {
					System.out.println("We have a draw!");
				}
				game.changePlayer();
			}
			else if (line.equals("exit")) {
				break;
			}
		}
	}

	
	public static void main(String[] args) {
		TicTacToeProgram program = new TicTacToeProgram();
		program.init();
		program.run();
	}

}
