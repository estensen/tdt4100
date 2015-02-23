package objectstructures;

public class Elev {
	
	private String navn;
	private Fag fag;
	
	public Fag getFag() {
		return fag;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public Elev(String navn) {
		this.navn = navn;
	}
}
