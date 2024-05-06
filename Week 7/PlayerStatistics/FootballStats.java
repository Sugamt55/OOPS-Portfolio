package Week7.PlayerStatistics;

public class FootballStats extends PlayerStats{
	 private int goals;

	public FootballStats(String Player_Name,int Player_id){
			super(Player_Name,Player_id);
			this.goals=0;
	}
	
	public void goal_record() {
		goals++;
		game_record(1);
	}
	

	
	public int getgoals() {
		return goals;
	}

}