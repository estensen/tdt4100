package objectstructures;

import java.util.Arrays;
import java.util.List;

public class Card {
	
	private int face;
	private char suit;
	private List<Character> validSuits = Arrays.asList('D','C','S','H');
	
	public Card(char suit, int face) {
		
		if (validSuits.contains(suit)) {
			this.suit = suit;
		}
		else {
			throw new IllegalArgumentException("Ugyldig korttype");
		}
		
		if (face < 1 || face > 13) {
			throw new IllegalArgumentException("Ugyldig tallverdi på kortet!");
		}
		else {
			this.face = face;
		}
	}
	
	public char getSuit() {
		return suit;
	}
	
	public int getFace() {
		return face;
	}
	
	public String toString() {
		return String.valueOf(suit)+String.valueOf(face);
	}
	
}
