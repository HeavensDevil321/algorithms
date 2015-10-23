package algorithm;

import java.util.ArrayList;

public class Swap 
{
	private static int x = 1;
    private static int y = 2;
    //private static ArrayList<Integer> q;
    
    
	public static void main(String[] args) 
	{
		Swap swap = new Swap();
		//ArrayList<Integer> q = new ArrayList();
		
		//swap static
        System.out.println("Before swaping static:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        swap.swapStatics();
        
        System.out.println("After swaping static:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        //swap local par 
        System.out.println("Before swaping swapLocalPar:");
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        swap.swapLocalPar(x, y);
        
        System.out.println("After swaping swapLocalPar:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        //swaplocalpar2
        System.out.println("Before swaping swapLocalPar2:");
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        swap.swapLocalPar2(x, y);
        
        System.out.println("After swaping swapLocalPar2:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        System.out.println("Before swaping swapArray:");
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        //swap.swapArray(a[], x, x);
        
        System.out.println("After swaping swapArray:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
	}
	
	public void swapStatics()
	{
		 int temp;
		 temp = x;
		 x = y;
		 y = temp;
	}
	
	 public String swapLocalPar(int x, int y)
	 {
		 int temp;
		 temp = x;
		 x = y;
		 y = temp;  //FIXME here didnt work?
		 
		 return x+","+y;
	 }
	 
	 public String swapLocalPar2(int x, int y)
	 {
		 
		 return  swapLocal2();
	 }
	 
	 private String swapLocal2()
	 {
		 int temp;
		 temp = x;
		 x= y;
		 y= temp;
		 
		 return x+","+y;
	 }
	 
	 public void swapArray(int a[], int index1, int index2)
	 {
		 
		 int temp = a[index1];
		 a[index1] = a[index2];
		 a[index2] = temp;
		 
	 }
	 
	 /**
	  * swaps the two elements in the arraylist
	  * @param q
	  * @param index1
	  * @param index2
	  */
	 public void swapList(ArrayList<Integer> q, int index1, int index2)
	 {
		 index1 = q.get(1);
		 index2 = q.get(2);
		 
		 int temp = index1;
		 index1 = index2;
		 index2 = temp;
		 
		 q.set(0, index1);
		 q.set(1, index2);
	 }
}
