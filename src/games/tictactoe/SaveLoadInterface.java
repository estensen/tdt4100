package games.tictactoe;

public interface SaveLoadInterface {

	public void save(String board, String filepath);
	public String load(String filepath);
}
