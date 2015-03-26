package interfaces;

import java.util.Iterator;

public class StringGridIterator implements Iterator<String> {
	
	private StringGrid stringGrid;
	private boolean rowMajor;
	int index = 0;
	int length;
	int row;
	int col;
	
	public StringGridIterator(StringGrid stringGrid, boolean rowMajor) {
		this.stringGrid = stringGrid;
		this.rowMajor = rowMajor;
		this.length = stringGrid.getRowCount() * stringGrid.getColumnCount();
		this.row = 0;
		this.col = 0;
	}
	
	@Override
	public boolean hasNext() {
		return !(index == length);
	}

	@Override
	public String next() {
		index++;
//		The iterators position
		String result = stringGrid.getElement(row, col);
//		The current element
		if (index < length) {
//			If there are more elements left to iterate
			if (rowMajor) {
//				Iterates through the elements in the rows first
				col++;
//				The next column
				if (col == stringGrid.getColumnCount()) {
//					If the column is out of index
					row++;
//					Then go to the next row
					col = 0;
//					And start with the first column
				}
			}
			else {
//				Do the opposite
				row++;
				if (row == stringGrid.getRowCount()) {
					col++;
					row = 0;
				}
			}
		}
		return result;
	}	
	
	public void remove() {
		throw new UnsupportedOperationException("It is not possible to remove a string");
	}

}
