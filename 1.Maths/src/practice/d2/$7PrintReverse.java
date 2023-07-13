package practice.d2;

public class $7PrintReverse {

	public static void main(String[] args) {
		int x=123456789;
		while( x>0) {
			int dada=x%10;
			System.out.print(dada);
			x=x/10;
		}
		System.out.println();
	}
}
