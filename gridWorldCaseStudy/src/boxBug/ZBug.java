package boxBug;

import info.gridworld.actor.Bug;

public class ZBug extends Bug 
{
	private int steps;
	private int sideLength;
	private boolean dir = false;
	private int totalSteps;

	/**
	 * Constructs a Z bug that traces a Z of a given length.
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) 
	{
		setDirection(90);
		steps = 0;
		sideLength = length;
	}

	/**
	 * Moves to the next location of the Z.
	 */
	public void act() 
	{
		if (totalSteps < sideLength * 3) 
		{
			if (steps < sideLength && canMove()) 
			{
				move();
				steps++;
				totalSteps++;				
			}
			
			else
			{
				if(canMove() == false)
				{
					totalSteps = sideLength * 3;
				}
					
				if(dir == false) 
				{
					turn();
					turn();
					turn();
					steps = 0;
					dir = true;
				}

				else
				{
					turn();
					turn();
					turn();
					turn();
					turn();
					steps = 0;
					dir = false;
				}
			}
		}
	}
}
