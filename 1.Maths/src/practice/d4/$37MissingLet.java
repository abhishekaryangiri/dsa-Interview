package practice.d4;

import java.util.Scanner;
import java.util.Arrays;

public class $37MissingLet {
	// Define the main method for running the program.
	  public static void main(String[] args) {
	    // Initialize an array of strings representing letters.
	    // You can use one of these alternative 'str_arra' arrays by uncommenting them.
	    // String[] str_arra = {"A", "B", "D", "E"};
	    // String[] str_arra = {"a", "b", "c", "e"};
	    String[] str_arra = {"p", "r", "s", "t"};
	    System.out.printf("Original array of elements:\n" + Arrays.toString(str_arra));

	    // Call the 'test' method to find the missing letter in the array.
	    String result = test(str_arra);
	    System.out.printf("\nMissing letter in the said array: " + result);
	  }
	  
	  
}
