package Animal;

public class Dog implements Comparable {

	private int position = 0;
	
	public String getName()
	{
		return "Generic Dog";
	}
	
	public void advance()
	{
		position++;
	}
	
	public int getPosition()
	{
		return position;
	}

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
