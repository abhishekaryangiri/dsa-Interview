package interviewQuestion;

public class FequencyCounterOfNumber {
	public static int findFrequency(int[] array, int number) {
        int frequency = 0;

        // Iterate through the array and count occurrences of the number
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                frequency++;
            }
        }
        return frequency;
    }
	public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 6,6,5, 2, 3,6, 2, 4, 2 };
        int numberToFind = 2;
        int frequency = findFrequency(numbers, numberToFind);
        System.out.println("The frequency of " + numberToFind + " is: " + frequency);
    }
	}
