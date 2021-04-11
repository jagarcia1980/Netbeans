
package Animal;

public class Cow implements Animal{

	private String name;
	private int position = 0;
	private int rounds = 1;
	
	public Cow(String name)
	{
		this.name = name;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void advance()
	{
		if (rounds > 0)
		{
			position += 2;
		}
		if (rounds == 3)
		{
			rounds = -6;
		}
		rounds++;
	}
	
	public int getPosition()
	{
		return position;
	}
}
