package practice.d1;

import java.util.Scanner;

public class $4Scanner {
public static void main(String[] args) {
	 Scanner scanner= new Scanner(System.in);
	 System.out.println("Enter First Value");
	 int x = scanner.nextInt();
	 System.out.println("Enter Second Value");
	 int y = scanner.nextInt();
	 System.out.println("What you want to do");
	 char res = scanner.next().charAt(0);
	 
	 switch(res) {
	 case '*' : System.out.println("Output : " + (x*y));
	 break;
	 case '-' : System.out.println( "Output: "+  (x-y));
	 break;
	 case '+' : System.out.println("Output : " + (x+y));
	 break;
	 case '/' : System.out.println("Output : " + (x/y));
	 break;
	 case '%' : System.out.println("Output : " + (x%y));
	 break;
	 default : System.out.println("Input error");
	 }
}
}
