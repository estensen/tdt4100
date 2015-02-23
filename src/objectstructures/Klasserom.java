package objectstructures;

public class Klasserom {
	
	Elev elev = new Elev("Vemund1");
	
	public Klasserom() {
		
	}
	
	public static void main(String[] args) {
		Klasserom klasse = new Klasserom();
		System.out.println(klasse.elev.getNavn());
		
	}
}
