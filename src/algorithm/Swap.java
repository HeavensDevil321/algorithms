package algorithm;

import java.util.ArrayList;

public class Swap 
{
	private static int x = 1;
    private static int y = 2;
    private static int x1 = 1;
    private static int y1 = 2;
    private static ArrayList<Integer> arraylist;
    
    
	public static void main(String[] args) 
	{
		Swap swap = new Swap();
		arraylist = new ArrayList<Integer>();
	    arraylist.add(1);
	    arraylist.add(0);
		
		//swap static
        System.out.println("Before swaping static:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);        
        swap.swapStatics();        
        System.out.println("After swaping static:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        System.out.println("");
        System.out.println("");
        
        //swap local par 
        System.out.println("Before swaping swapLocalPar:");
        System.out.println("x value: "+x1);
        System.out.println("y value: "+y1);
        System.out.println("After swaping swaplocalPar:");
        System.out.println(swap.swapLocalPar(x1, y1));     
        
        System.out.println("");
        System.out.println("");
        
        //swaplocalpar2
        System.out.println("Before swaping swapLocalPar2:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);        
        swap.swapLocalPar2(x, y);        
        System.out.println("After swaping swapLocalPar2:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Before swaping swapArray:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);        
        //swap.swapArray(a[], x, x);        
        System.out.println("After swaping swapArray:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        
        System.out.println("");
        System.out.println("");
        
        //arraylist swap
        System.out.println("Before swaping swapList:");
        System.out.println("x value: "+arraylist.get(0));
        System.out.println("y value: "+arraylist.get(1));        
        swap.swapList(arraylist,arraylist.get(0), arraylist.get(1));        
        System.out.println("After swaping swapList:");
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
	
	 public String swapLocalPar(int x1, int y1)
	 {
		 int temp;
		 temp = x1;
		 x1 = y1;
		 y1 = temp;  
		 
		 return "x value: " + x1 +","+ "y value: " +y1;
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
	 public void swapList(ArrayList<Integer> arraylist, int index1, int index2)
	 {
		 index1 = arraylist.get(1);
		 index2 = arraylist.get(2);
		 
		 int temp = index1;
		 index1 = index2;
		 index2 = temp;
		 
		 arraylist.set(0, index1);
		 arraylist.set(1, index2);
	 }
}
