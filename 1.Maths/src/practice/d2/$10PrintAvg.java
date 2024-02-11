package practice.d2;

import java.util.Scanner;

public class $10PrintAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input1: ");
		int s1 = scan.nextInt();
		
		System.out.println("input2");
		int s2 = scan.nextInt();
		
		System.out.println("input3");

		int s3 = scan.nextInt();
				
			int avg = (s1+s2+s3)/3;

		System.out.println("Avg: " +avg);
		scan.close();
		 //close the scanner to release the resources
	}

}
