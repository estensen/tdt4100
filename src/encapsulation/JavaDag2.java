package encapsulation;

public class JavaDag2 {
	public JavaDag2() {
		this("Bla bla", 1234);
	}
	
	public JavaDag2(String text, double tall) {
		this.text = text;
//		this.tall = tall;
	}
	
	String text;
	double tall;
//	private double pi = 3.14159265;
	
	public void setText() {
		text = "halla";
	}
	
	public void setText(String text) {
		checkText(text);
		this.text = text;
	}
	
	public void checkText(String vemund1) {
		if (vemund1 == "homo") {
			throw new IllegalAccessError();	
			}
		}
	
	public String toString() {
		return "Dette er en JavaDag2-klasse";
	}
	
}


//cmd + shift + L


