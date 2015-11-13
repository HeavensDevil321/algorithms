package progseven;

import java.util.Scanner;
import java.io.*;

/**
 * @author german rivera
 * @date 11/13/2015
 * This program is to calculate the gcd and lcm with int
 * by using file data.txt.
 *
 */
public class Divisibility 
{

	/**
	 * Test :P
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		try
		{
			int[] numbers = readInt();
			System.out.println("Gcf  ("+numbers[0]+", "+numbers[3]+") ="+gcf(numbers[0], numbers[3]));
			System.out.println("                                :P                                      ");
			System.out.println("lcm  ("+numbers[1]+", "+numbers[2]+") ="+lcm(numbers[1], numbers[2]));
		}
		catch(Exception err)
		{
			err.printStackTrace();
		}
	}
	
	/**
	 * A file reader that returns 4 int that is in an array.
	 * @return
	 */
	public static int[] readInt()throws Exception
	{
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		String content = "";
		
		while((line = br.readLine()) != null)
		{
			content += line;
		}
		
		br.close();
		
		String[] stringNumbers = content.split(", ");
		int[] integerNumbers = new int[stringNumbers.length];
		
		for(int x = 0; x < stringNumbers.length; x++)
		{
			integerNumbers[x] = Integer.parseInt(stringNumbers[x]);
		}
		
		return integerNumbers;
		
	}
	
	/**
	 * Method to calculate the gcd
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcf(int a, int b)
	{
	    while (b > 0)
	    {
	        int temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	
	/**
	 * Method to calculate the lcm
	 * @param a
	 * @param b
	 * @return
	 */
	public static int lcm(int a, int b)
	{
	    return a * (b / gcf(a, b));
	}

}
