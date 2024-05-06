package Week7.PlayerStatistics;

public class CricketStats extends PlayerStats{
	private int runs;
	
	public CricketStats(String Player_Name,int Player_id){
		super(Player_Name,Player_id);
		this.runs=0;	
	}
	
	public void run_record(int run){
		runs+=run;
		game_record(run/10);
	}
	
	public int getruns() {
		return runs;
	}

}