package practice.d3NestedLoop;

public class $2Pattern2 {
	
	public static void printRec(int tR, int tC) {
		//outerLoop
		for( int a=1;a<=tR;a++) {
			//inr col
			for(int b=1;b<=tC;b++) {
				//
				if(a==1|| a==tR || b==1 || b==tC) {
					System.out.print("*");
				}else {
					System.out.println(" ");
				}
			}
			public static void main(String[] args) {
				//6.3
				printRec(10, 7);
	}
}