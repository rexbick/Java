package boxBug;

import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class BabyRockMonsterRunner 
{
	public static void main(String[] args) 
	{
		Color myColor = new Color(0, 255, 0);
		Color hateColor = new Color(255, 0, 0);
		
        ActorWorld world = new ActorWorld();        
        BabyRockMonster bob = new BabyRockMonster(myColor, hateColor);
        
        world.add(new Location(5, 5), bob);
        world.show();
	}

}
