
public class Sports {
	private Player[] roster;
	private int maxNum;
	
	public Sports(Player[] roster, int maxNum) {
		roster = new Player[maxNum];
	}
	
	public void addRoster(Player[] newPlayers) {
		roster = newPlayers;
	}
	
}
