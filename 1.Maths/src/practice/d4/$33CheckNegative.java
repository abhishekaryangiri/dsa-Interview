package practice.d4;
import java.util.Scanner;
import java.util.Arrays;

public class $33CheckNegative {
	// Define the main method for running the program.
	  public static void main(String[] args) {
	    // Initialize an array of numbers.
	    int[] nums = {1, -2, -5, -4, 3, -6};
	    // Alternative input arrays:
	    // int[] nums = {1, 2, 5, -4, 3, -6};
	    // int[] nums = {1, 2, -5, -4, -3, 6};
	    System.out.printf("\nOriginal array of numbers:\n" + Arrays.toString(nums));

	    // Call the 'test' method to check for negative dominance in the array.
	    boolean result = test(nums);
	    System.out.printf("\nCheck Negative Dominance in the said array! " + result);
	  }

	  
	  
}
