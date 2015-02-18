package stateandbehavior;

public class Location {
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Location() {
		
	}

	public Location(int x, int y) {
		this.x = 0;
		this.y = 0;
	}
	
	void up() {
		y++;
	}
	
	void down() {
		y--;
	}
	
	void left() {
		x--;
	}
	
	void right() {
		x++;
	}
}
