package launchers;

import java.util.ArrayList;

import game.TurnTracker;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> players = new ArrayList<Integer>();
		
		players.add(54);
		players.add(21);
		players.add(13);
		players.add(43);
		
		TurnTracker t = new TurnTracker(players);
		
		System.out.println("0 :: "+t.getTurnPlayersID());
		for(int i =1; i<11; i++)
		{
			
			System.out.println(i+" :: "+t.nextTurn());
		}
	}

}
