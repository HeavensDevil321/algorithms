/**
 * 
 */
package progeight;

import java.util.ArrayList;


/**
 * @author ggrivera
 * @Date 11/23/2015
 */
public class InsertionSort 
{
	private Integer[] array;
	private static ArrayList<Integer> list;
	
	public static void main(String[] args) 
	{
		
	}
	
	public void insertionSort(Comparable[] A)
	{
		for (int currentSorted = 1; currentSorted < A.length -1; currentSorted++)
		{
			int nextElement = (int) A[currentSorted];
			int compareI = currentSorted-1;
			
			while ((compareI > 0))
			{
				A[compareI] = A[compareI-1];
				compareI--;
			}
			
			A[compareI] = nextElement;
		}
	}
	//&& (A[compareI] > nextElement)
	

}
    //BufferReader out;
	//out = new BufferReader(new FileReader("data.txt"));
	//out.write(Integer.toString