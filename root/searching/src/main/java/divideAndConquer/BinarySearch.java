package divideAndConquer;

public class BinarySearch {
	
	
    static int[] orderedRange = {1, 3, 5, 7, 9, 11, 13, 15, 17};
	
    public static void main(String[] args) {
    	
    	/*
    	 * The "target" is one of the elements within the range that you want to test. 
    	 * It's a specific configuration, setting, or
    	 *  factor that you suspect might be the
    	 *   source of the problem.
    	 */
         int target = 7;

        int result = binarySearch(target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binarySearch(int target) {
        int left = 0;
        int right = orderedRange.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (orderedRange[middle] == target) {
                return middle; // Target found, return its index.
            } else if (orderedRange[middle] < target) {
                left = middle + 1; // Target is in the right half.
            } else {
                right = middle - 1; // Target is in the left half.
            }
        }

        return -1; // Target not found in the array.
    }
}
