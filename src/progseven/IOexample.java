package progseven;

/** Example of Java console I/O using Scanner class */

import java.util.Scanner;

class IOexample
{
   public static void main(String argv[])
   {
      //String s;
      int    i;
      //double d;

      Scanner in = new Scanner (System.in);
	  
      
      // Read an integer
      System.out.print("Enter an int: ");
      i = in.nextInt();
      
       System.out.println("The integer is: " + i);
      
      
      // Read a string
      //System.out.print("Enter a string without spaces: ");
      //s = in.next();
      
      // Read a double
      //System.out.print("Enter a double: ");
      //d = in.nextDouble();

      // Print out results
      //System.out.println("The string is: " + s);
     
      //System.out.println("The double is: " + d);
   }  // end main
}  // end IOexample


