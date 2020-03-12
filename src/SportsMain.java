// The client 'main' tester routine - load your sports database, and produce desired output.
public class SportsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player Joe1 = new BaseballPlayer ("Joe", 7, "Mariners", 0.312, 30, 97);
		//System.out.println(Joe.BaseballPlayertoString());
		
		Player Joe2 = new BaseballPlayer ("Joe", 7, "Mariners", 0.312, 30, 97);
		System.out.println(Joe2.equals(Joe1));
		
		Player[] players = new Player[5];
		players.addRoster(1, Joe1);
		
		Sports roster = new Sports(players, 5);
				
	}

}
