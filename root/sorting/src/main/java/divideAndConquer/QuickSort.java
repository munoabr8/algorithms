package divideAndConquer;

import java.util.Arrays;

public class QuickSort {

	
	private static int[] sortMe;
 
	public QuickSort(final int[] array) {

		sortMe = array;
	 
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 2, 9, 3, 6,10,4, 8, 1, 7 };

		QuickSort sortingAlo = new QuickSort(arr);
		sortingAlo.sort();
	}

	private void sort() {
		
		int low = 0;
		int high = sortMe.length - 1;
		quickSort(low, high);

		display();

	}
	
	boolean isFirstIteration() {
		
		
		
		return false;
	}

	/*
	 * invariant:
	 *  0 <= low
	 *  high <= sortMe.length - 1
	 *  high != 0;
	 */
 
	public  void quickSort(int low, int high) {
		
		//assert  high <= sortMe.length - 1;
	
		//assert 0 <= low;
		
		if (low < high) {
			int pivotIndex = partition(low, high);
			
			quickSort(low, pivotIndex - 1);
			quickSort(pivotIndex + 1, high);
		}
	}
//    int[] inputArray = {4, 2, 6, 1, 5};
	/*
	 * low and high values is dependent on
	 * the number of elements in the array.
	 */
	public  int partition(int low, int high) {
		//assert  0 <= high;
		//assert  high <= sortMe.length - 1;
		
		//assert 0 <= low;
		//assert low <= high;


 		int pivot = sortMe[high];
 		
		 
		int i = low - 1;
		
		//assert -1 <= i;
		//assert i <= high;

		
		for (int j = low; j < high; j++) {
			
			//assert 0 <= j;
			//assert j < sortMe.length -1;

			if (sortMe[j] < pivot  ) {
				i++;
				
 				assert i <= j;
				swap(i, j);
			}
		}
		
 
		swap(i + 1, high);
		return i + 1;
	}
//Requires i >= 0
	
	public void swap(int i, int j) {
		
		//System.out.println("swap i is: "+ i);

		int temp = sortMe[i];
		sortMe[i] = sortMe[j];
		sortMe[j] = temp;
	}
	
	
	private void display() {

		System.out.println("Sorted Array: " + Arrays.toString(sortMe));

	}

}
