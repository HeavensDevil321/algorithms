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
	
	public void insertionSort(ArrayList<Integer> a)
	{
		int j, y;
		
		for (ArrayList<Integer> currentSorted = 1; currentSorted < a.size() -1; currentSorted++)
		{
			ArrayList<Integer> nextElement = list;
			ArrayList<Integer> compareI = currentSorted-1;
			
			while ((j > 0))
			{
				compareI = compareI-1;
				compareI--;
			}
			
			compareI = nextElement;
		}
		
		
		
//		int i,j;    
//
//	    for (i = 1; i < a.size(); i++) 
//		{
//	        Integer key = new Integer(0, "","");
//	        key.value = Array.get(i).value;
//	        key.suit = Array.get(i).suit;
//	        key.faceValue = Array.get(i).faceValue;
//	        j = i;
//	        while((j > 0) && (Array.get(j - 1).value > key.value)) {
//	            Array.set(j,Array.get(j - 1));
//	            j--;
//	        }
//	        Array.set(j,key);
//	    }
		
		
		
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
	
	public void print(ArrayList<Integer> a, Comparable<Integer> b[], String msg) throws Exception
	{
		int inLine = 0;
		
		BufferedWriter out;	
				
		out = new BufferedWriter(new FileWriter("data.txt"));
		
		out.write("original arrayL. : ");
		
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
		out.write("sorted array: ");
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
