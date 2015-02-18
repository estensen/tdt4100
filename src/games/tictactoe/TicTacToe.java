package games.tictactoe;


public class TicTacToe {
	
	
	
	private char[][] board;
	private char currentPlayerMark;

	
	public TicTacToe() {
		this.board = new char[3][3];
		addEmptySpace();
		currentPlayerMark = 'x';
	}
	
	private void addEmptySpace() {
			for (int col = 0; col < board.length; col++) {
				for (int row = 0; row < board[col].length; row++) {
				board[col][row] = (' ');
			}
		}
	}
	
	public boolean isValidMove(int col, int row) {
		if (board[col][row] == ' ') {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean checkForWin() {
		return (checkRowsForWin() || checkColsForWin() || checkDiagonalsForWin());
	}	
	
	private boolean checkRowsForWin() {
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] == currentPlayerMark && board[1][i] == currentPlayerMark && board[2][i] == currentPlayerMark) {
				return true;
			}
		}
		return false;
	}

	private boolean checkColsForWin() {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == currentPlayerMark && board[i][1] == currentPlayerMark && board[i][2] == currentPlayerMark) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkDiagonalsForWin() {
		if (board[0][0] == currentPlayerMark && board[1][1] == currentPlayerMark && board[2][2] == currentPlayerMark) return true;
		else if (board[2][0] == currentPlayerMark && board[1][1] == currentPlayerMark && board[0][2] == currentPlayerMark) return true;
		else return false;
	}
	
	
	public boolean isFull() {
		boolean isFull = true;
		for (int col = 0; col < board.length; col++) {
			for (int row = 0; row < board.length; row ++) {
				if (board[col][row] == ' ') {
					isFull = false;
					break;
				}
			}
		}
		return isFull;
	}
	
	Character getCurrentPlayerMark() {
		return currentPlayerMark;
	}
	
	public void changePlayer() {
		if (currentPlayerMark == 'x') {
			currentPlayerMark = 'o';
		}
		
		else {
			currentPlayerMark = 'x';
		}
	}
	
	public void placeMark(int col, int row) {
		board[col][row] = currentPlayerMark;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String newLine = System.getProperty("line.separator");

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++)
				if (row < (board.length)) {
					builder.append(" "+board[col][row]+" ");
					if (col < 2) {
						builder.append("|");
					}
					else if (col == 2 && row < 2) {
						builder.append(newLine);
						builder.append("-----------");						
					}
				}
			builder.append(newLine);
		}
		
		return builder.toString();
	}
}
