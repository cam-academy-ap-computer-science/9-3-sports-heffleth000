
public class BasketballPlayer extends TeamPlayers{
	private double ppg;
	private double rpg;
	private double apg;
	
	public BasketballPlayer (String name, int number, String team, double ppg, double rpg, double apg) {
		super (name, number, team);
		this.ppg = ppg;
		this.rpg = rpg;
		this.apg = apg;
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
	
	public double getPPG() {
		return ppg;
	}
	
	public double getRPG() {
		return rpg;
	}
	
	public double getAPG() {
		return apg;
	}
	
	public String BasketballPlayertoString() {
		return "Name: " + getName() + " Number: " + getNumber() + " Team: " + getTeam() + " PPG: " + ppg + " RPG: " + rpg + " APG: " + apg;
	}
	
	public boolean equals(Object o) {
		if (o instanceof BasketballPlayer) {
			BasketballPlayer other = (BasketballPlayer) o;
			return (other.getName() == getName()) && (other.getNumber() == getNumber()) && (other.getTeam() == getTeam()) && (other.getPPG() == ppg) && (other.getRPG() == rpg) && (other.getAPG() == apg);
		} else {
			return false;
		}
	}
	
}
