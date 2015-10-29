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
			int value = (int)(Math.random()*100000);
			array1[x] = value;
		}
		
		time2 = System.nanoTime();
		
		System.out.println("The time it took"+ (time1 - time2)+ "nanoseconds to build array1");
	}
	
	public SystemTime(int[] g)
	{
		
	}
	
	public void BubbleSort(int[] g)
	{
		for(int x = 0; x < array2.length; x++)
		{
			for(int y = 0; y < array2.length; y++)
			{
				if(array1[y] < array2[y])
				{
					int temp;
					temp = array1[y];
					array1[y] = array2[y + 1];
					array2[y + 1] = temp;
				}
			}
		}
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
