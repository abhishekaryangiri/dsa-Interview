package practice.d4;

import java.util.Scanner;

public class $38CountVowelConso {
	public static void main(String args[]) {
	System.out.println("Please enter some text"); 
	Scanner reader = new Scanner(System.in); 
	String input = reader.nextLine();
	char[] letters = input.toCharArray(); 
	int count = 0;
	for (char c : letters) { 
		switch (c) 
		{ 
	case 'a': case 'e': case 'i': case 'o': case 'u': count++; break; 
	}
	default:
	}
	}
		
}
