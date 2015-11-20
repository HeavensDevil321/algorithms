package progeight;

import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * @author ggrivera
 *
 */
public class InsertionSelectionSort 
{
	private static Integer[] arr;
	private static ArrayList<Integer> list;
	
	public static void main(String[] args) 
	{
		InsertionSelectionSort sort = new InsertionSelectionSort();
		
		sort.createArray();
		
		try
		{
			sort.print(list, arr, "");
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
		
	}
	
	public void createArray()
	{
		arr = new Integer[100];
		list = new ArrayList<Integer>(100);
		
		for(int i = 0; i < 100; i++)
		{
			int random = (int) (Math.random()*100);
			arr[i] = random;
		}
		
		for(int i = 0; i < 100; i++)
		{
			int random = (int) (Math.random()*100);
			list.add(i, random);
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
	
	public Comparable<Integer>[] selectionSort(Comparable<Integer> arr[])
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
		int inLine = 0;
		
		BufferReader out;	
				
		out = new BufferReader(new FileReader("data.txt"));
		
		out.write("original arrayL. : ");
		
		out.newLine();
		
		for(int x= 0; x < a.size(); x++)
		{
			out.writer(""+a.size()+ " ");
			inLine++;
			
			if(inLine == 10)
			{
				out.newLine();
				inLine = 0;
			}
		}
		
		out.newLine();
		out.write("normal array");
		out.newLine();
		
		
		for(int x= 0; x < b.length; x++)
		{
			out.writer(""+b.length+ " ");
			inLine++;
			
			if(inLine == 10)
			{
				out.newLine();
				inLine = 0;
			}
		}
		
		insertionSort(list);
		selectionSort(arr);
		
		out.newLine();
		out.write("sorted array: ");
		out.newLine();
		
		for(int x= 0; x < a.size(); x++)
		{
			out.writer(""+a.get(x)+ " ");
			inLine++;
			
			if(inLine == 10)
			{
				out.newLine();
				inLine = 0;
			}
		}
		
		out.newLine();
		out.write("sorted array: ");
		out.newLine();
		
		for(int x= 0; x < b.length; x++)
		{
			out.writer(""+b[x]+ " ");
			inLine++;
			
			if(inLine == 10)
			{
				out.newLine();
				inLine = 0;
			}
		}
		
		out.close();
		
		
		
		
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
