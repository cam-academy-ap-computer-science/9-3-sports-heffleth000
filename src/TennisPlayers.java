
public class TennisPlayers{
	private String name;
	private int careerWins;
	private int careerLosses;
	private int careerAces;
	
	public TennisPlayers (String name, int cw, int cl, int ca) {
		this.name = name;
		careerWins = cw;
		careerLosses = cl;
		careerAces = ca;
	}
	
	public String getName() {
		return name;
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
	
	public String TennisPlayertoString() {
		return "Name: " + name +  "Career Wins: " + careerWins + " Career Losses: " + careerLosses + " Career Aces: " + careerAces;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TennisPlayers) {
			TennisPlayers other = (TennisPlayers) o;
			return (other.getName() == name) && (other.getWins() == careerWins) && (other.getLosses() == careerLosses) && (other.getAces() == careerAces);
		} else {
			return false;
		}
	}
	
}
