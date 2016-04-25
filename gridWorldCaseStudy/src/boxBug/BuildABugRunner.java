package boxBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class BuildABugRunner 
{
	public static void main(String[] args) 
	{
		ActorWorld world = new ActorWorld();
		BuildABug alice = new BuildABug(Color.ORANGE);
		BuildABug bob = new BuildABug(Color.BLUE);
		BuildABug bib = new BuildABug(Color.RED);
		BuildABug bub = new BuildABug(Color.GREEN);
		BuildABug bab = new BuildABug(Color.YELLOW);
		BuildABug beb = new BuildABug(Color.BLACK);	
		world.add(new Location(7, 8), alice);
		world.add(new Location(5, 5), bob);
		world.add(new Location(5, 4), bib);
		world.add(new Location(5, 6), bub);
		world.add(new Location(5, 7), bab);
		world.add(new Location(5, 8), beb);
		world.show();
	}
}