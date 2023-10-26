package practice.d4;

public class $4Swap {
	// swap of 2 numbers
public static void swap(int x, int y) {
	
	int res = x;
	x = y;
	y = res;
	System.out.println("x:  "+ x);
	
	System.out.print("y:  "+y);
}
public static void main(String[] args) {
	
	int x = 10;int y = 20;
	
	swap(x, y);
	
}
}
