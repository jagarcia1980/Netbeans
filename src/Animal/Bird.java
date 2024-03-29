package Animal;

import java.util.Random;

public class Bird implements Animal {

	private int position = 0;
	private String name;
	
	public Bird(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
        @Override
	public void advance()
	{
		Random rand = new Random();
	    position += rand.nextInt(5);
	}
	
        @Override
	public int getPosition()
	{
		return position;
	}
	
}
