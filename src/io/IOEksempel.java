package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOEksempel {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("/Users/estensen/workspace/tdt4100/src/io/eksempel.txt"));
		String line = null;
		int lineNum = 1;
		while ((line = reader.readLine()) != null) {
			System.out.println(lineNum + ": " + line);
			lineNum++;
		}
		reader.close();
	}

}
