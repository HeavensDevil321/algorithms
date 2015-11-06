/**
 * 
 */
package progsix;

import java.io.*;  
import java.util.Scanner;

/**
 * @author German Rivera
 * Made an algorithm that takes a lot of random and normal number 
 * and sorts and checks how long it takes.
 * Also searches for target with binary search.
 */
public class SystemTime 
{
	private int[] array1; //random
	private int[] array2; //Default
	private int target;
	
	public static void main(String[] args) 
	{
		int[] x = new int[10000];
		SystemTime test = new SystemTime();
		test.BubbleSortArray1(x);
		test.BubbleSortArray2(x);
	    test.binarySearch(x, 143);
		
	}
	
	/**
	 * constructor for the random array and tell the time.
	 * 
	 */
	public SystemTime()
	{
		array1 = new int[10000];
		
		double time1;
		double time2;
		
		time1 = System.nanoTime();
		
		System.out.println("time1: "+ time1);
		
		for(int x = 0; x < array1.length; x++)
		{			
			int value = (int)(Math.random()*10000);
			array1[x] = value;
		}
		
		time2 = System.nanoTime();
		
		System.out.println("time2: "+ time2);
		
		System.out.println("The time it took"+ (time1 / time2)+ "nanoseconds to build array1");
		
	}
	
	/**
	 * constructor for the default array and tell the time.
	 * @param g
	 */
	public SystemTime(int[] g)
	{
		array2 = new int[10000];
		
		double time3;
		double time4;
		
		time3 = System.nanoTime();
		
		for(int x = 0; x < array2.length; x++)
		{
			int value = g[10000];
			array2[x] = value;
		}
		
		time4 = System.nanoTime();
		
		System.out.println("The time it took"+ (time3 - time4)+ "nanoseconds to build array2");
	}
	
	/**
	 * bubble sorts the array.
	 * @param g
	 */
	public void BubbleSortArray1(int[] g)
	{
		double time5;
		double time6;
		
		time5 = System.nanoTime();
		
		System.out.println("time5: "+ time5);
		
		for(int x = 0; x < array1.length; x++)
		{
			for(int y = 0; y < array1.length; y++)
			{
				if(array1[y] < array1[y])
				{
					int temp;
					temp = array1[y];
					array1[y] = array1[y + 1];
					array1[y + 1] = temp;
				}
			}
		}
		
		time6 = System.nanoTime();
		
		System.out.println("time6: "+ time6);
		
		System.out.println("It took "+ (time5 - time6)+ "nanoseconds to sort array1");
	}
	
	/**
	 * bubble sorts the array.
	 * @param g
	 */
	public void BubbleSortArray2(int[] g)
	{
		double time5;
		double time6;
		
		time5 = System.nanoTime();
		
		System.out.println("time5: "+ time5);
		
		for(int x = 0; x < array2.length; x++)
		{
			for(int y = 0; y < array2.length; y++)
			{
				if(array2[y] < array2[y])
				{
					int temp;
					temp = array2[y];
					array2[y] = array2[y + 1];
					array2[y + 1] = temp;
				}
			}
		}
		
        time6 = System.nanoTime();
        
        System.out.println("time6: "+ time6);
		
        
		System.out.println("It took "+ (time5 - time6)+ "nanoseconds to sort array2");
	}
	
	
	
	/**
	 * 
	 * @param target the target to set
	 */
	public void setTarget(int target) 
	{
		
		
		this.target = target;
	}
	

	/**
	 * Returns the target.
	 * @return
	 */
	public int getTarget()
	{
//		BufferedReader sc = null;
//		sc = (new BufferedReader(new FileReader()));
		return target;
	}
	
	/**
	 * Takes the target and does binarysearch to find it in the array.
	 * @param a
	 * @param target
	 * @return
	 */
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
				found = true; 
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

/**
 * I.
 * For the constructor method :
 * What "n" did you choose for the problem and what is O(n)? __n^2___for random _____-1.4________for pre-sorted
 * What was the time the constructor took to run? t1 = ___2.7nano____for random _____-1.5________for pre-sorted
 * Run the simulation again using using 10 times the number of elements in question 1
 * What was the time the constructor took to run? t2 = ____2.8____for random ______-1.3________for pre-sorted
 * What is t2 / t1 and how does it relate to O(n) from question (i)? _______3.0________for random _____-1.6_______for pre-sorted
 * ---------------------------------------------------------------------------------------------------------------------------------
 * II.
 * What "n" did you choose for the problem and what is O(n)? _________n^2____________
 * What was the time the sort took to run? t1 = ____________1.4________________
 * Run the simulation again using 10 times the number of elements in question 1
 * What was the time the sort took to run? t2 = ____________1.5________________
 * What is t2 / t1 and how does it relate to O(n) from question (i)? ________3.0____________
 * -----------------------------------------------------------------------------------------------------------------------------------
 * III.
 * What "n" did you choose for the problem and what is O(n)? _________n^2__________
 * What was the time the search took to run? t1 = ______________1.5______________
 * Run the simulation again using using 10 times the number of elements in question 1
 * What was the time the search took to run? t2 = _______________1.6_____________
 * What is t2 / t1 and how does it relate to O(n) from question (i)? _3.1_______
 * -----------------------------------------------------------------------------------------------------------------------------------
 * IV.
 * Based upon the above answers, did the time correspond with the "Big-Oh" calculations for each of the three methods? 
 * constructor? yes  sorting? yes  searching? yes
 *  
 * V. Clarify any discrepancies between O(n) theory and what you found in practice:
 * Some numbers are greater than the other and takes longer to generate more than then the usual number.
 * 
 * 
 */
