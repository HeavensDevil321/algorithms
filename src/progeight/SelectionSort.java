/**
 * 
 */
package progeight;

import java.util.ArrayList;


/**
 * @author ggrivera
 *
 */
public class SelectionSort 
{
	private Integer[] array;
	private static ArrayList<Integer> list;
	
	public static void main(String[] args) 
	{

	}
	
	public boolean selectionSort(Comparable<Integer> A[])
	{
		for (int endOfArray = A.length; endOfArray > 0; endOfArray--)
		{
			int max = (int) A[0]; // start max at first element
			int maxIndex = 0;
												
			for (int i = 0; i < endOfArray; i++)
			{
				if ((int)A[i] > max) 
				{
					max = (int) A[i]; maxIndex = i;
				}
			}	
			
			int temp;
			temp = maxIndex;
			A[maxIndex] = A[endOfArray];
			A[endOfArray] = temp;
//			swap(A,maxIndex,endOfArray);
		}
		return false;
		
	} 
	
	

}
