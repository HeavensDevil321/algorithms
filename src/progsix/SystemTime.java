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
	
	public static void main(String[] args) 
	{
		int[] x = new int[10000000];
		SystemTime test = new SystemTime();
		test.BubbleSort(x);
	}
	
	
	public SystemTime()
	{
		array1 = new int[10000000];
		
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
	
	public boolean binarySearch(int[] a, int target)
	{
		int left = 0;
		int right = a.length; 
		int middle = (left+right)/2;
		boolean found = false;		
		while ((!found) && (left <= right))
		{
			if (a[middle] == target)
			{
				found = true; // or return true ????
			}			
		 	else
		 	{
		 		if (target < a[middle])
		 		{
		 			right = middle - 1;
		 		}
		 		else
		 		{
		 			left = middle + 1;
		 			middle = (left + right) / 2;
		 		}
		 	}
		}
		return false; 
	}
}
