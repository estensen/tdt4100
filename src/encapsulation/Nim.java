package encapsulation;

public class Nim {
	private int[] targetPile;
	
	public Nim(int pileSize) {
		if (pileSize < 2) {
			throw new IllegalStateException("There has to be more than 1 stone in each pile");
		}
		else {
			targetPile = new int[]{pileSize, pileSize, pileSize};
		}
	}
	
	public Nim() {
		
	}
	
	void removePieces(int number, int targetPile) {
		
		
		if (isGameOver() == true) {
			toString();
		}
	}
	
	boolean isValidMove(int number, int targetPile) {
		if (number < 1) {
			throw new IllegalArgumentException("Stones can't be added to the pile");
		}
		else if (number - targetPile < 1) {
			throw new IllegalStateException("There isn't that many stones in that pile");
		}
		else {
			return true;
		}
	}
	
	boolean isGameOver() {
		for (int i : targetPile) {
//			sjekker alle haugene og ser om alle er større enn 1
			if (targetPile[i] > 1) {
				return false;
			}
		}
		return true;
	}
	
	int getPile(int targetPile) {
//		int getPile(int targetPile) - returnerer antall brikker i haug targetPile. 
//		gir ikke mening da targetPile er en liste?
		return this.targetPile[targetPile];
	}
	
	public String toString() {
		return "Game Over!";
	}
	
	public static void main(String[] args) {
		Nim myGame = new Nim(5);
		myGame.removePieces(2, 0);
		myGame.removePieces(4, 1);
		myGame.removePieces(4, 2);
		myGame.removePieces(2, 0);
	}
}
