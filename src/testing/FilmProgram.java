package testing;

public class FilmProgram {

	
	void init() {
		
	}
	
	void run() {
		Film film1 = new Film();
		film1.tittel = "Aleksander";
		film1.alder = 15;
		film1.nasjonalitet = "USA";
		
		Sal sal1 = new Sal();
		sal1.navn = "Nova3";
		sal1.antallSeter = 135;
		
		Filmvisning fm1 = new Filmvisning();
		fm1.film = film1;
		fm1.sal = sal1;
		
		System.out.println(fm1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilmProgram program = new FilmProgram();
		program.init();
		program.run();
	}

}
