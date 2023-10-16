package divideAndConquer;

import java.util.Arrays;

public class QuickSort {

	private static int[] sortMe;
 
	public QuickSort(final int[] array) {

		sortMe = array;
	 
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 2, 9, 3, 6, 10,4, 8, 1, 7 };

		QuickSort sortingAlo = new QuickSort(arr);
		sortingAlo.sort();
	}

	public void sort() {
		
		int low = 0;
		int high = sortMe.length - 1;
		quickSort(low, high);

		display();

	}


 
	public static void quickSort(int low, int high) {
		
		
		
		if (low < high) {
			int pivotIndex = partition(low, high);
			
			quickSort(low, pivotIndex - 1);
			quickSort(pivotIndex + 1, high);
		}
	}

	public static int partition(int low, int high) {
		int pivot = sortMe[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (sortMe[j] < pivot) {
				i++;
				swap(i, j);
			}
		}
		swap(i + 1, high);
		return i + 1;
	}

	public static void swap(int i, int j) {
		int temp = sortMe[i];
		sortMe[i] = sortMe[j];
		sortMe[j] = temp;
	}
	
	
	private void display() {

		System.out.println("Sorted Array: " + Arrays.toString(sortMe));

	}

}
