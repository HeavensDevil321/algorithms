/**
 * 
 */
package progsix;

/**
 * @author ggrivera
 *
 */
public class SystemTime 
{
	private int[] array1; //random
	private int[] array2; //Default
	
	public SystemTime()
	{
		array1 = new int[100000];
		
		double time1;
		double time2;
		
		time1 = System.nanoTime();
		
		for(int x = 0; x < array1.length; x++)
		{			
			int value = (int)Math.random();
			array1[x] = value;
		}
		
		time2 = System.nanoTime();
		
		System.out.println("The time it took"+ (time1 - time2)+ "nanoseconds to build array1");
	}
	
	public SystemTime(int[] g)
	{
		
	}
	
	public void bubbleSort(int[] g)
	{
		
	}
	
	public void getTarget()
	{
		return;
	}
	
	public boolean binarySearch()
	{
		return false;
	}
}
