// The client 'main' tester routine - load your sports database, and produce desired output.
public class SportsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BASEBALL PLAYERS
		Player FL = new BaseballPlayer ("Francisco Lindor", 12, "Indians", 0.284, 32, 74);
		Player JC = new BaseballPlayer ("JP Crawford", 2, "Mariners", 0.226, 7, 46);
		Player MB = new BaseballPlayer ("Mookie Betts", 7, "Dodgers", 0.295, 29, 80);
		Player MT = new BaseballPlayer ("Mike Trout", 7, "Angels", 0.291, 45, 104);
		Player CY = new BaseballPlayer ("Christian Yelich", 7, "Brewers", 0.329, 44, 97);
		
		Player[] baseballPlayers = {FL, JC, MB, MT, CY};	
		Sports baseballRoster = new Sports(baseballPlayers, 5);

		System.out.println("BASEBALL ROSTER");
		for (int i = 0; i < baseballPlayers.length; i++) {
			System.out.println(baseballPlayers[i]);
		    baseballPlayers[i].toString();
		    System.out.println();
		}
		
		//BASKETBALL PLAYERS
		Player DL = new BasketballPlayer ("Damian Lillard", 0, "Blazers", 28.9, 4.3, 7.8);
		Player LJ = new BasketballPlayer ("Lebron James", 23, "Lakerss", 25.7, 7.9, 10.6);
		Player JT = new BasketballPlayer ("Jayson Tatum", 0, "Celtics", 23.6, 7.1, 2.9);
		Player LD = new BasketballPlayer ("Luka Doncic", 77, "Warriors", 28.7, 9.3, 8.7);
		Player KW = new BasketballPlayer ("Kemba Walker", 8, "Celtics", 21.2, 4.1, 4.9);
		
		Player[] basketballPlayers = {DL, LJ, JT, LD, KW};	
		Sports basketballRoster = new Sports(baseballPlayers, 5);
		
		System.out.println("BASKETBALL ROSTER");
		for (int i = 0; i < basketballPlayers.length; i++) {
			System.out.println(basketballPlayers[i]);
		    basketballPlayers[i].toString();
		    System.out.println();
		}
		
		//TENNIS PLAYERS
		Player RF = new TennisPlayers ("Roger Federer", 1242, 271, 11365);
		Player ND = new TennisPlayers ("Novak Djokovic", 911, 187, 5722);
		Player RN = new TennisPlayers ("Rafael Nadal", 990, 200, 3540);
		Player AM = new TennisPlayers ("Andy Murray", 673, 196, 5708);
		Player SW = new TennisPlayers ("Serena Williams", 834, 144, 3891);
		
		Player[] TennisPlayers = {RF, ND, RN, AM, SW};	
		Sports TennisRoster = new Sports(baseballPlayers, 5);
		
		System.out.println("TENNIS ROSTER");
		for (int i = 0; i < TennisPlayers.length; i++) {
			System.out.println(TennisPlayers[i]);
		    TennisPlayers[i].toString();
		    System.out.println();
		}

				
	}

}
