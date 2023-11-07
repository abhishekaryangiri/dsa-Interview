package practice.d4;

import java.util.Scanner;

public class $14ArrayScanClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 
	int[] marks=new int[100];
	System.out.println("Enter your physics marks   :");
	marks[0] =sc.nextInt();//physics
	System.out.println("Enter your chemistry marks  :");
	marks[1] =sc.nextInt();//chemistry
	
	System.out.println("Enter your maths marks  :");
	
	marks[2] =sc.nextInt();//maths h
	
	System.out.println("Enter your biology marks  :");
	
	marks[3] =sc.nextInt();//biology .....
	
	System.out.println("Physics marks = "+marks[0]);
	
	System.out.println("Chemistry marks = "+marks[1]);
	System.out.println("Maths marks = "+marks[2]);
    System.out.println("Biology marks ="+marks[3]);
	//update maths marks
	marks[2]=87;
	System.out.println("Maths marks : "+marks[2]);
	
	//update chemistry marks
	marks[1]=marks[1]+2;
	System.out.println("Chemistry marks : "+marks[1]);
	
	int per=(marks[0]+marks[1]+marks[2]+marks[3])/4;
	System.out.println("Percentage  is  :"+per+" % ");
	sc.close();
}
}
