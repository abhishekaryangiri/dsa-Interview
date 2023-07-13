package practice.d2;

import java.util.Scanner;

public class $8RevScanner {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter input");
	int x = scan.nextInt();
	
	while( x>0) {
		int dada=x%10;
		System.out.print(dada);
		x=x/10;
	}
System.out.println();
}
}
