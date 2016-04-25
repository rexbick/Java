package boxBug;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

public class BabyRockMonster extends Bug
{
    private Color hateColor;
    private Color myColor;
    
    public BabyRockMonster(Color mine, Color hate)
    {
    	setColor(mine);
    	myColor = mine;
    	hateColor = hate;
    }
    
    public void createRock(Color rockCo, Location rockLoc)
    {
    	Rock toby = new Rock(rockCo);
    	Grid<Actor> grid = getGrid();
    	
    	toby.putSelfInGrid(grid, rockLoc);
    }
    
    public void act()
    {
    	Grid<Actor> grid = getGrid();
    	int dir = getDirection();
    	Location myLocation = getLocation();
    	Location frontLoc = myLocation.getAdjacentLocation(dir);
    	Actor actor = grid.get(frontLoc);
    	
    	if(grid.isValid(frontLoc) && actor instanceof Rock)
    	{
    		Color rockColor = actor.getColor();
    		
    		if(rockColor.equals(myColor))
    		{
    			actor.removeSelfFromGrid();
    		}
    		
    		if(rockColor.equals(hateColor))
    		{
    			for(int turnCount = 1; turnCount <= 4; turnCount ++)
    			{
    				turn();
    			}    			
    		}
    	}
    }
}
