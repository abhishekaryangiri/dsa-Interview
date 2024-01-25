package practice.d2;

import java.util.Scanner;

public class $12Scannerconti {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter number:");
			int x = scan.nextInt();
			if(x%5==0) {
				continue;
				//break;
			}
			System.out.println("You entered: "+ x);
			scan.close();
		}while(true);
	}
}
