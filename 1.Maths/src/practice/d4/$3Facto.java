package practice.d4;

public class $3Facto {

	public static int facto(int n) {
		int f = 1;
		for(int x=1; x<=n; x++) {
			f = f*x;
		}
		return f;
	}
	public static void main(String[] args) {
		int r = facto(5);
		System.out.println(r);
	}
}