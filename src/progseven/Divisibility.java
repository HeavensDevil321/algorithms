package progseven;

/**
 * @author german rivera
 * 
 *
 */
public class Divisibility 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			gcf.readInt();
		}
		catch
		{
			c.printStackTrace();
		}
	}
	
	public int readInt()throw Execption
	{
		c = (FileReader(new FileReader()));
		
		
	}
	
	public int gcd(int a, int b)
	{
	    while (b > 0)
	    {
	        int temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	
	public int lcm(int a, int b)
	{
	    return a * (b / gcd(a, b));
	}

}
