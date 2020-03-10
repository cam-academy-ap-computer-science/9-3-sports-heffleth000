
public class BaseballPlayer extends TeamPlayers{
	private double battingAverage;
	private int homeruns;
	private int rbi;
	
	public BaseballPlayer (String name, int number, String team, double ba, int hr, int rbi) {
		super (name, number, team);
		battingAverage = ba;
		homeruns = hr;
		this.rbi = rbi;
	}
	public String getName() {
		return super.getName();
	}
	
	public int getNumber() {
		return super.getNumber();
	}
	
	public String getTeam() {
		return super.getTeam();
	}
	
	public double getBA() {
		return battingAverage;
	}
	
	public int getHR() {
		return homeruns;
	}
	
	public int getRBI() {
		return rbi;
	}
	
	public String BaseballPlayertoString() {
		return "Name: " + getName() + " Number: " + getNumber() + " Team: " + getTeam() + " Batting Average: " + battingAverage + " Homeruns: " + homeruns + " RBI: " + rbi;
	}
	
	public boolean equals(Object o) {
		if (o instanceof BaseballPlayer) {
			BaseballPlayer other = (BaseballPlayer) o;
			return (other.getName() == getName()) && (other.getNumber() == getNumber()) && (other.getTeam() == getTeam()) && (other.getBA() == battingAverage) && (other.getHR() == homeruns) && (other.getRBI() == rbi);
		} else {
			return false;
		}
	}
	
}
