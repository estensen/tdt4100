package encapsulation;

public class LineEditorProgram {
	LineEditor lineEditor;
	
	void init() {
		lineEditor = new LineEditor("Hallo", 2);
	}
	
	void run() {
		lineEditor.left();
		lineEditor.insertString("zzz");
		lineEditor.right();
		lineEditor.deleteRight();
		System.out.println(lineEditor);
	}
	
	public static void main(String[] args) {
		LineEditorProgram program = new LineEditorProgram();
		program.init();
		program.run();
	}
}
