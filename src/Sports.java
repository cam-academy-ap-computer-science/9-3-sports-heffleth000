
public class Sports {
	private Player[] roster;
	private int maxNum;
	
	public Sports(Player[] roster, int maxNum) {
		roster = new Player[maxNum];
	}
	
	public Player[] addRoster(int num, Player P) {
		roster[num - 1] = P;
		return roster;
	}
	
}
