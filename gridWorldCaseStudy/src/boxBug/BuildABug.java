package boxBug;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;
import java.awt.Color;


public class BuildABug extends Bug
{
	public BuildABug()
	{
	}
	
	public BuildABug(Color myColor)
	{
		setColor(myColor);
	}
	
	public BuildABug(int myDirection)
	{
		setDirection(myDirection);
	}
	
	public BuildABug(Color myColor, int myDirection)
	{
		setColor(myColor);
		setDirection(myDirection);
	}
	
	public void act() 
	{
		Grid <Actor> grid = getGrid();
		int direction = getDirection();
		Location loc = getLocation(); 
		Location frontLoc = loc.getAdjacentLocation(direction);
		
		int moveLength = (int) (Math.random() * 10);
		int whichWayToTurn = (int) (Math.random() * 10);
		
		
		if(grid.isValid(frontLoc))
		{
			Actor entity = grid.get(frontLoc);
			
			if(entity instanceof Bug)
			{
				entity.removeSelfFromGrid();
				
		    	Flower toby = new Flower();
		    	
		    	toby.putSelfInGrid(grid, frontLoc);
				
			}
		}
		
					
		for(int howLongWillYouMove = 0; howLongWillYouMove <= moveLength; howLongWillYouMove++)
		{
			if(canMove())
			{
				move();
			}
				
			else
			{
				moveLength = 0;
			}
		}
		
		if(canMove())
		{
			if(whichWayToTurn % 2 == 0)
			{
				turn();
			}
			
			else
			{
				int dir = getDirection();
				int turnLeft = dir - 45;
				
				setDirection(turnLeft);
			}
		}
		
		else
		{
			turn();
		}

	}
}
