package testing;

public class Film {
	String tittel;
	int alder;
	String nasjonalitet;
	
	public String toString() {
		return String.format("[Film tittel=%s alder=%d nasjonalitet=%s]", tittel, alder, nasjonalitet);
	}
}
