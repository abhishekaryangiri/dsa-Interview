package practice.d3NestedLoop;

public class $6Tria3 {
public static void main(String[] args) {
	int x=6;
	//out loop
	for( int a=1; a<=x; a++) {
		//inn loop spc
		for( int b=1; b<=x-a; b++) {
			System.out.print(" ");
		}
			//inn loop
			for( int b=1; b<=x; b++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}

