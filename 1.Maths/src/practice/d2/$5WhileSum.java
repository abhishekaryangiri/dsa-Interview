package practice.d2;

import java.util.Scanner;

public class $5WhileSum {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter input");
	int x = scan.nextInt();
	
	int tot = 0;
	
	int a=1;
	while(a<=x) {
		tot+=a;
		a++;
	}
	System.out.println("Total: "+ tot);
}
}
