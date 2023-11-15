package practice.d4;

public class $15ReverseArray {
	public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[myArray.length];
        
        for (int i = 0; i < myArray.length; i++) {
            reversedArray[i] = myArray[myArray.length - 1 - i];}
	}
}
