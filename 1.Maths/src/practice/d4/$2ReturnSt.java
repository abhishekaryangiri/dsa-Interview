package practice.d4;

import java.util.Scanner;

public class $2ReturnSt {
	public static int cal(int num1, int num2) {		
		
		return  num1 * num2;
	}
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the first num: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second num: ");
		int num2 = scan.nextInt();
		
		int ans = cal(num1, num2);
		System.out.println("Output: "+ans);
		//scan.close();
	}
}
