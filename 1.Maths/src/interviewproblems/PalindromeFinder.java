package interviewproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeFinder {
public static void main(String[] args) {
    String[] array = {"madam", "car", "aaa", "radar", "dog"};

    List<String> palindromes = findPalindromes(array);
    System.out.println("Given Array: "+Arrays.asList(array));

    System.out.println("Possible palindromes in the given array: " + palindromes);
}

public static List<String> findPalindromes(String[] array) {
    List<String> palindromes = new ArrayList<>();

    for (String str : array) {
        if (isPalindrome(str)) {
            palindromes.add(str);
        }
    }

    return palindromes;
}

public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}
}
