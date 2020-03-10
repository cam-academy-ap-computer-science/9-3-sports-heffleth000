
public class TeamPlayers {
	private String name;
	private int number;
	private String team;
	
	public TeamPlayers (String name, int number, String team) {
		this.name = name;
		this.number = number;
		this.team = team;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getTeam() {
		return team;
	}
	
	public String TeamPlayertoString() {
		return "Name: " + name + " Number: " + number + " Team: " + team;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TeamPlayers) {
			TeamPlayers other = (TeamPlayers) o;
			return (other.getName() == name) && (other.getNumber() == number) && (other.getTeam() == team);
		} else {
			return false;
		}
	}
	
}
