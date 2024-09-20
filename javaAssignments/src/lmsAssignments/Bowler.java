package lmsAssignments;

public class Bowler {
	private String name;
	private int wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;
	
	public Bowler() {
		name="sachin";
		wickets=10;
		matches=5;
		balls_bowled=750;
		runs_conceded=463;
	}
	public Bowler(String Name,int Wickets,int Matches,int Ballsbowled,int Runsconceded) {
		this.name=Name;
		this.wickets=Wickets;
		this.matches=Matches;
		this.balls_bowled=Ballsbowled;
		this.runs_conceded=Runsconceded;
	}
	public void computeBowlingAverage() {
		System.out.println("Average of "+ runs_conceded/wickets);
	}
		
	

}
