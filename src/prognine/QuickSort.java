package prognine;

/**
 * @author german g. rivera
 * @date 12/2/2015
 * This program does quick sort in which it grabs the first number of the array and makes
 * it a pivot point swap numbers that are smaller than it to the left and large to the right
 * and continues until every thing is sorted
 */
public class QuickSort 
{
	
	private int array[];
    private int length;
    
    public static void main(String a[])
    {         
        QuickSort sorter = new QuickSort();
        
        int[] input = new int[10];// makes the array of 10
        
        for(int x = 0; x < 10; x++)//makes the array full of random numbers
        {
        	int random = (int) (Math.random()*100);
			input[x] = random;
        }
        
        System.out.print("original array: ");//prints the original array
        for(int i:input)
        {
        	System.out.print(i);
        	System.out.print(" ");
        }
        
        
        sorter.sort(input);// execute the sort 
        
        System.out.print("\nSorted array: ");//prints the sorted array
        
        for(int i:input)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
    /**
     * the sort method calls upon the the array to do quick sort
     * and also checks if it is null or zero
     * @param inputArr
     */
    public void sort(int[] inputArr) 
    {
         
        if (inputArr == null || inputArr.length == 0) //depending if one of the conditions is true
        {
            return;
        }
        
        this.array = inputArr;
        
        length = inputArr.length;
        
        quickSort(0, length - 1);
    }
    
    /*
     * simple swap method for the sort between numbers
     */
    private void exchangeNumbers(int i, int j) 
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /**
     * 
     * @param lowerIndex
     * @param higherIndex
     */
    private void quickSort(int lowerIndex, int higherIndex) 
    {         
        int i = lowerIndex;
        int j = higherIndex;
        
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        // Divide into two arrays
        while (i <= j) 
        {
        	
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) 
            {
                i++;
            }
            
            while (array[j] > pivot) 
            {
                j--;
            }
            
            if (i <= j) 
            {
                exchangeNumbers(i, j);
                
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        
        // call quickSort() method recursively
        if (lowerIndex < j)
        {
            quickSort(lowerIndex, j);
        }
        
        if (i < higherIndex)
        {
            quickSort(i, higherIndex);
        }
    }     
}