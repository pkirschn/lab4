package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		
    	int top, bottom, changes;
    	do { changes = 0;
    		for(int i = 1; i < array.length; i++) {
    			top = array[i - 1];
    			bottom = array[i];
    			if (top > bottom) {
    				array[i] = top;
    				array[i - 1] = bottom;
    				changes++;    				
    			}
    		}
    		
    	}
    	while(changes > 0);

        return array;
    }
}
