package games.tictactoe;

import java.util.Stack;

public class DoRedo {
//	Implements undo and redo for the double list
//	Each element in the stack is the whole board

//	Each element in the stack is a double list containing a char
	Stack<char[][]> undoHistory = new Stack<>();
	Stack<char[][]> redoHistory = new Stack<>();
	
	
	public DoRedo() {
		
	}
	
	public void saveUndoBoard(char[][] board) {
//		Saves new board when a move is made
		char[][] boardCopy = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
				boardCopy[i][j] = board[i][j];
			}
		}
		undoHistory.push(boardCopy);
	}
	
	public void saveRedoBoard(char[][] board) {
//		Saves new board when a move is made
		char[][] boardCopy = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
				boardCopy[i][j] = board[i][j];
			}
		}
		redoHistory.push(boardCopy);
	}
	
	public void resetRedoBoard() {		
		redoHistory = new Stack<>();
	}
	
	public char[][] undo() {
		char[][] lastState = undoHistory.pop();
		
//		char[][] newState = undoHistory.pop();
		return lastState;
	}
	
	public char[][] redo() {
		char[][] lastState = redoHistory.pop();
//		undoHistory.push(lastState);
		return lastState;		
	}
}
