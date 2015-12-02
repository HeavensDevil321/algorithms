package progeight;

import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Germán g. Rivera
 * @date 11/23/2015
 * This gives two different arrays that has array and arrayList both will do their own algorithm to 
 * sort their random numbers.
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
	
	/**
	 * creates the individual array with random numbers
	 */
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
	
	/**
	 * insertion Sort 
	 * @param a
	 */
	public void insertionSort(ArrayList<Integer> a)
	{

		for (int currentSorted = 1; currentSorted < a.size(); currentSorted++)
		{
			int nextElement = a.get(currentSorted);
			int compareI;
			
			for(compareI = currentSorted - 1; compareI >= 0 
					&& nextElement < a.get(compareI); compareI--)
			{
				int test1 = a.get(compareI + 1);
				int test2 = a.get(compareI);
				
				int test3 = test1;
				test2 = test1;
				test1 = test3;
				
				a.set(compareI+1, test1);
				a.set(compareI, test2);
			}
			a.set(compareI +1, nextElement);
		}
	}

	/**
	 * Selection sort picks a number in the array sorts them by size of each 
	 * number
	 * @param arr
	 */
	public void selectionSort(Comparable<Integer> arr[])
	{
        
        for (int i = 0; i < arr.length; i++)
        {
            int index = i;
            
            for (int j = i + 1; j < arr.length; j++)
            {
                if ((int)arr[j] < (int)arr[index])
                {
                    index = j;
                }
            }
            if(index != i)
            {
	            int smallerNumber = (int)arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
            }
        }
    }
		
	/**
	 * This prints the out put on a data.txt file
	 * @param a
	 * @param b
	 * @param msg
	 * @throws Exception
	 */
	public void print(ArrayList<Integer> a, Comparable<Integer> b[], String msg) throws Exception
	{
		int inLine = 0;
		
		BufferedWriter out;	
				
		out = new BufferedWriter(new FileWriter("data.txt"));
		
		out.write("original arrayList. : ");
		
		out.newLine();
		
		for(int x= 0; x < a.size(); x++)
		{
			out.write(""+a.size()+ " ");
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
			out.write(""+b.length+ " ");
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
		out.write("sorted arrayList: ");
		out.newLine();
		
		for(int x= 0; x < a.size(); x++)
		{
			out.write(""+a.get(x)+ " ");
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
			out.write(""+b[x]+ " ");
			inLine++;
			
			if(inLine == 10)
			{
				out.newLine();
				inLine = 0;
			}
		}		
		out.close();		
	}
}
