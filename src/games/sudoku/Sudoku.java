package games.sudoku;

import java.util.Scanner;

public class Sudoku {
	
	private Scanner input;
	String text = ".....2..38.273.45....6..87.9.8..5367..6...1..4513..9.8.84..3....79.512.62..8.....";
	SudokuBoard board;
	
	public Sudoku() {
		
	}
	
	public void init() {
		board = new SudokuBoard(text);
		input = new Scanner(System.in);
	}
	
	public void run() {
		while (true) {
			System.out.println(board);
			String line = input.nextLine();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sudoku game = new Sudoku();
		game.init();
		game.run();
	}

}
