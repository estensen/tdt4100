package interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class StringGridImpl implements StringGrid {
	
	private ArrayList<ArrayList<String>> stringGrid = new ArrayList<>();
	private int columnCount;
	private int rowCount;
	
	public StringGridImpl(int rows, int cols) {
		for (int i = 0; i < cols; i++) {
			ArrayList<String> tempList  = new ArrayList<>();
			for (int j = 0; j < rows; j++) {
				tempList.add(null);
			}
			stringGrid.add(tempList);
		}
		this.columnCount = cols;
		this.rowCount = rows;
	}
	
	public void checkIfValidLength(int column, int row) {
		if (row <= rowCount && column <= columnCount) {
		}
		else {
			throw new IllegalArgumentException("The rows or columns are out of range");	
		}
	}

	@Override
	public int getRowCount() {
		return rowCount;
	}

	@Override
	public int getColumnCount() {
		return columnCount;
	}

	@Override
	public String getElement(int row, int column) {
		checkIfValidLength(row, column);
		return stringGrid.get(column).get(row);
	}

	@Override
	public void setElement(int row, int column, String element) {
		checkIfValidLength(row, column);
		stringGrid.get(column).set(row, element);
	}

	@Override
	public Iterator<String> iterator() {
		return new StringGridIterator(this, true);
	}

	
	public static void main(String[] args) {
		StringGridImpl grid = new StringGridImpl(2,2);
		grid.setElement(0, 0, "0,0");
		grid.setElement(0, 1, "0,1");
		grid.setElement(1, 0, "1,0");		
		grid.setElement(1, 1, "1,1");
		StringGridIterator iterator = new StringGridIterator(grid, true);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
//		
//		for (String s : grid) {
//			System.out.println(s);
		}
	}
}
