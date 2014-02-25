package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {

	    int size = array.length; 
	    for(int i = 1; i < size; i++) {
		    int val = array[i]; 
		    int j;
		    
		    for(j = i-1; (j >= 0) && (array[j] < val); j--) {
			    array[j+1] = array[j];
		    }
		    array[j+1] = val; 
	    }

	    return array;
	}
}
