// The client 'main' tester routine - load your sports database, and produce desired output.
public class SportsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballPlayer Joe1 = new BaseballPlayer ("Joe", 7, "Mariners", 0.312, 30, 97);
		//System.out.println(Joe.BaseballPlayertoString());
		
		BaseballPlayer Joe2 = new BaseballPlayer ("Joe", 7, "Mariners", 0.3120, 30, 97);
		System.out.println(Joe2.equals(Joe1));
	}

}
