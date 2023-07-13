package practice.d2;

import java.util.Scanner;
//print no from 1 to given input
public class $2WhileLoopScanner {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("enter end point");
	int end = ip.nextInt();
	int start = 1;
	System.out.println("Output");
	while(start<=end) {
		//System.out.println("Hello Java");
		System.out.println(start+ " ");
		start++;
	}
}
}
