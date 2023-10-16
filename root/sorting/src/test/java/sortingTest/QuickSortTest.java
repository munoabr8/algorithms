package sortingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doNothing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import divideAndConquer.QuickSort;



public class QuickSortTest {
	
    int[] inputArray = {4, 2, 6, 1, 5};

     private QuickSort classUnderTest = new QuickSort(inputArray);

    
	@Test
    void testPartition() {
        // Define the test data
        int low = 0;
        int high = inputArray.length - 1;

        // Set up mock behavior for the swap method
 
        // Call the partition method
        int result = classUnderTest.partition(low, high);

        // Perform assertions
        assertEquals(3, result); // Replace with the expected result

        // Verify that the swap method was called as expected
        // You can add Mockito verify statements here if needed
    }

}
