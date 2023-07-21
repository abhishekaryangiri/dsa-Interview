package practice.d3NestedLoop;

public class $3Pattern3hollow {
public static void main(String[] args) {
	int a=4,b=5;
	//out Loop
	for( int i=1; i<=a; i++) {
		//inr Loop
		for( int j=1; j<=b; j++) {
			if(i==1 || j==1 || i==a || j==b) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
