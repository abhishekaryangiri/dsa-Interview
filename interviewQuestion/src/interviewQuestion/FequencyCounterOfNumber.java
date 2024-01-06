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
}
