package boxBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains circle bugs.
 */
public class CircleBugRunner 
{
	public static void main(String[] args) 
	{
		ActorWorld world = new ActorWorld();
		CircleBug alice = new CircleBug(6);
		alice.setColor(Color.ORANGE);
		CircleBug bob = new CircleBug(3);
		world.add(new Location(7, 8), alice);
		world.add(new Location(5, 5), bob);
		world.show();
		System.out.println(bob.getGrid());
	}
}
