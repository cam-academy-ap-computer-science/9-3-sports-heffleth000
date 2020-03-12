
public class TeamPlayers extends Player{
	private int number;
	private String team;
	
	public TeamPlayers (String name, int number, String team) {
		super(name);
		this.number = number;
		this.team = team;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getTeam() {
		return team;
	}
	
	public String TeamPlayertoString() {
		return "Name: " + super.getName() + " Number: " + number + " Team: " + team;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TeamPlayers) {
			TeamPlayers other = (TeamPlayers) o;
			return (other.getName() == super.getName()) && (other.getNumber() == number) && (other.getTeam() == team);
		} else {
			return false;
		}
	}
	
}
