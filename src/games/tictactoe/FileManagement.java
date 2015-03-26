package games.tictactoe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManagement implements SaveLoadInterface{

	@Override
	public void save(String board, String filepath) {
		try {
//			It is not necessary to split the board before saving to a file 
			String[] splitBoard = board.split("\n"); 
			PrintWriter output = new PrintWriter(filepath);
			for (int i = 0; i < splitBoard.length; i++) {
				output.println(splitBoard[i]);
			}
			output.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
	}

	@Override
	public String load(String filepath) {
		String resultBoard = "";
		try {
			Scanner input = new Scanner(new FileReader(filepath));	
			while (input.hasNextLine()) {
				resultBoard += input.nextLine();
			}
					
			input.close();
		}
		catch (FileNotFoundException e){
			System.out.println("File not found!");
		}
		return resultBoard;
		
	}

}
