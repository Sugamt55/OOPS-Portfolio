package Week7.PlayerStatistics;

public class SportsPlayerStats {

	public static void main(String[] args) {
		
		FootballStats foot = new FootballStats("Goalie Man",94);
		CricketStats crick = new CricketStats("Wicket Taker",42);
		
		
		foot.goal_record();
		foot.goal_record();
		foot.goal_record();
		foot.game_record(0);
		
		crick.run_record(50);
		crick.run_record(75);
		crick.run_record(58);
		crick.game_record(0);
		
		
		
		
		
		System.out.println("FOOTBALL PLAYER STATS");
		System.out.println("---------------------------------------------");
		System.out.println("Name:"+foot.getplayername());
		System.out.println("ID:"+foot.getplayeid());
		System.out.println("Games played:"+ foot.getgameplayed());
		System.out.println("Goal scored:"+foot.getgoals());
		System.out.println("Average point:"+foot.Averagepont_pergame());
		
		System.out.println("\n");
		 
		System.out.println("CRICKET PLAYER STATS");
		System.out.println("---------------------------------------------");
		System.out.println("Name:"+crick.getplayername());
		System.out.println("ID:"+crick.getplayeid());
		System.out.println("Games played:"+ crick.getgameplayed());
		System.out.println("Runs taken:"+crick.getruns());
		System.out.println("Average point:"+crick.Averagepont_pergame());

			
	}

}