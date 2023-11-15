package practice.d4;

import java.util.Arrays;

public class $15ReverseArray {
	public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 400, 50};
        int[] reversedArray = new int[myArray.length];
        
        for (int i = 0; i < myArray.length; i++) {
            reversedArray[i] = myArray[myArray.length - 1 - i];
            }
        System.out.println(Arrays.toString(reversedArray));
	}
}
