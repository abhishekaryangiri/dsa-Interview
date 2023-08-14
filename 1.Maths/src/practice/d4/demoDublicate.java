package practice.d4;

import java.util.HashMap;
import java.util.Map;

public class demoDublicate {
    public static void main(String[] args) {
        char[] letters = {'A', 'V', 'S', 'S', 'V', 'W', 'R', 'E', 'A', 'Y', 'Y', 'R', 'P'};
        
        Map<Character, Integer> letterFrequency = new HashMap<>();
        
        for (char letter : letters) {
            letterFrequency.put(letter, letterFrequency.getOrDefault(letter, 0) + 1);
        }
        
        System.out.println("Unique letters:");
        for (char letter : letterFrequency.keySet()) {
            if (letterFrequency.get(letter) == 1) {
                System.out.print(letter + " ");
            }
        }
        
        System.out.println("\nDuplicate letters:");
        for (char letter : letterFrequency.keySet()) {
            if (letterFrequency.get(letter) > 1) {
                System.out.print(letter + " ");
            }
        }
    }
}
