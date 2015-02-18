package encapsulation;

public class LineEditor {
	String text;
	int insertionIndex;
	
	public LineEditor() {
		
	}
	
	public LineEditor(String text, int insertionIndex) {
		this.text = text;
		this.insertionIndex = insertionIndex;
	}
	
	void left() {
		insertionIndex --;
	}
	
	void right() {
		insertionIndex ++;
	}
	
	void insertString(String s) {
		text = text.substring(0,insertionIndex) + s + text.substring(insertionIndex, text.length());
		insertionIndex += s.length();
	}
	
	void deleteLeft() {
		text = text.substring(0, insertionIndex - 1) + text.substring(insertionIndex, text.length());
	}
	
	void deleteRight() {
		text = text.substring(0, insertionIndex) + text.substring(insertionIndex + 1,  text.length());
	}
	
	public String toString() {
		String temptext = text = text.substring(0, insertionIndex) + "|" + text.substring(insertionIndex,  text.length());
		return temptext;
	}
}
