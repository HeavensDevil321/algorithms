package progeight;

import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author ggrivera
 *
 */
public class InsertionSelectionSort 
{
	private Integer[] arr;
	private static ArrayList<Integer> list;
	
	public static void main(String[] args) 
	{
		
	}
	
	public InsertionSelectionSort()
	{
		arr = new Integer[100];
		list = new ArrayList<Integer>(100);
		
		for(int i = 0; i < 101; i++)
		{
			arr[i] = new Integer((int)Math.random());
		}
		
		for(int i = 0; i < 101; i++)
		{
			list.add((int) Math.random());
		}
	}
	
	public void insertionSort(ArrayList<Integer> A)
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
	
	public void selectionSort(Comparable<Integer> arr[])
	{
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[index])
                {
                    index = j;
                }
            }
      
            int smallerNumber = (int)arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
	
	public void print(ArrayList a, Comparable b[], String msg) throws Exception
	{
		
		out = new BufferReader(new FileReader("data.txt"));
		out.write(Integer.toString() )
		BufferReader out;		
	}
//NOTE M's site has some code but hobbled

	
//	public boolean selectionSort(Comparable<Integer> A[])
//	{
//		for (int endOfArray = A.length; endOfArray > 0; endOfArray--)
//		{
//			int max = (int) A[0]; // start max at first element
//			int maxIndex = 0;
//												
//			for (int i = 0; i < endOfArray; i++)
//			{
//				if (A[i] > max) 
//				{
//					max = (int) A[i]; maxIndex = i;
//				}
//			}		
//			swap(A,maxIndex,endOfArray);
//		}
//		
//	} 
}
