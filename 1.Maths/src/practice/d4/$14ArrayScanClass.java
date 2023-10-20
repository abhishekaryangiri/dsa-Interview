package practice.d4;

import java.util.Scanner;

public class $14ArrayScanClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int[] marks=new int[100];
	marks[0] =sc.nextInt();//physics
	marks[1] =sc.nextInt();//chemistry
	marks[2] =sc.nextInt();//maths
	System.out.println("Physics marks: "+marks[0]);
	System.out.println("Chemistry marks: "+marks[1]);
	System.out.println("Maths marks: "+marks[2]);
}
}
