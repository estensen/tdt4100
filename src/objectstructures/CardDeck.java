package objectstructures;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	
	public CardDeck() {
		
		private List<Card> cards;
		
		public CardDeck(int n) {
			cards = new ArrayList<Card>();
			
			for (int i = 0; i < n; i++) {
				cards.add(new Card('S', i+1));
			}
			for (int i = 0; i < n; i++) {
				cards.add(new Card('H', i+1));
			}
			for (int i = 0; i < n; i++) {
				cards.add(new Card('D', i+1));
			}
			for (int i = 0; i < n; i++) {
				cards.add(new Card('C', i+1));
			}
		}
	}
}
