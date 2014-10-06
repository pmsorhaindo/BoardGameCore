package game;

import java.util.ArrayList;

public class TurnTracker {
	
	// List of player IDs indicating the order they are seated in
	ArrayList<Integer> seatingOrder;
	// ID of current player
	int turnPlayersID;
	// List of 
	ArrayList<Integer> skipList;
	boolean reverse;

	public TurnTracker(ArrayList<Integer> playerIDList){
		seatingOrder = playerIDList;
		skipList = new ArrayList<Integer>();
		reverse = false;
	}
	
	/**
	 * Returns the 
	 * @return
	 */
	public int nextTurn(){
		int pointer;
		if(!reverse)
		{
			pointer = seatingOrder.indexOf(turnPlayersID)+1;
		}
		else
		{
			pointer = seatingOrder.indexOf(turnPlayersID)-1;
		}
		
		if (pointer >= seatingOrder.size()) pointer = 0;
		
		while(skipList.contains(seatingOrder.get(pointer)))
		{
			pointer++;
			if (pointer >= seatingOrder.size()) pointer = 0;
		}
		
		turnPlayersID = seatingOrder.get(pointer);
		return turnPlayersID;
	}
	
	public int getTurnPlayersID() {
		return turnPlayersID;
	}
	
}
