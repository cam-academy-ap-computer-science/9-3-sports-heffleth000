
public class TennisPlayers extends Player{
	private int careerWins;
	private int careerLosses;
	private int careerAces;
	
	public TennisPlayers (String name, int cw, int cl, int ca) {
		super(name);
		careerWins = cw;
		careerLosses = cl;
		careerAces = ca;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public int getWins() {
		return careerWins;
	}
	
	public int getLosses() {
		return careerLosses;
	}
	
	public int getAces() {
		return careerAces;
	}
	
	public String toString() {
		return "Name: " + super.getName() +  " Career Wins: " + careerWins + " Career Losses: " + careerLosses + " Career Aces: " + careerAces;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TennisPlayers) {
			TennisPlayers other = (TennisPlayers) o;
			return (other.getName() == super.getName()) && (other.getWins() == careerWins) && (other.getLosses() == careerLosses) && (other.getAces() == careerAces);
		} else {
			return false;
		}
	}
	
}
