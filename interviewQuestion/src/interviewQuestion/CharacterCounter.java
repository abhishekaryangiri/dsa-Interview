package interviewQuestion;

public class CharacterCounter {
	public static void main(String[] args) {
        String input = "hello world";
        countAndPrintCharacterRepetitions(input);
    }

    public static void countAndPrintCharacterRepetitions(String input) {
        for (char c : input.toCharArray()) {
            int count = input.length() - input.replace(String.valueOf(c), "").length();
            System.out.println("Character: " + c + ", Count: " + count);
        }
    }
}
