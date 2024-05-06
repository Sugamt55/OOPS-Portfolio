package Week7.PlayerStatistics;

public class PlayerStats {
	
	private String Player_Name;
	private int Player_id;
	private int Game_played;
	private int Points;

	
	public PlayerStats(String Player_Name, int Player_id){
		this.Player_Name= Player_Name;
		this.Player_id= Player_id;
		this.Game_played=0;
		this.Points = 0;
	}
	
	public void game_record(int point_scored) {
		Game_played++;
		Points += point_scored;
	}
	
	public double Averagepont_pergame() {
		if (Game_played==0) {
			return 0;
		}
		return (double) Points/Game_played;
	}

	public String getplayername() {
		return Player_Name;
		
	}
	
	public int getplayeid() {
		return Player_id;
	}
	
	public int getgameplayed() {
		return Game_played;
	}
	
	public int getpoint() {
		return Points;
	}
}