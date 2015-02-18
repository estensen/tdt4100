package games.sudoku;


public class SudokuBoard {
	
	String text = ".....2..38.273.45....6..87.9.8..5367..6...1..4513..9.8.84..3....79.512.62..8.....";
	
	SudokuCell[][] tekstArr = new SudokuCell[9][9];
	
	
	public SudokuBoard(String inputBoard) {
		for (int col = 0; col < 9; col++) {
			for (int row = 0; row < 9; row++) {
				tekstArr[col][row] = new SudokuCell(inputBoard.charAt(col*9+row));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
