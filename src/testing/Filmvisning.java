package testing;

public class Filmvisning {
	Film film;
	Sal sal;
	String tid;
	int pris;
	
	public String toString() {
		return String.format("[Filmvisning filmtittel=%s sal=%s alder=%d pris=%d]", film.tittel, sal, film.alder, pris);
	}
}
