package practice.d4;

public class $5prime {
	public static boolean checkPrim(int x) {
		boolean checkPrim=true;
		for( int a=2; a<=x-1; x++) {
			if(x%a==0) {
				checkPrim=false;
				break;
			}
		}
		return checkPrim;
	}
	public static void main(String[] args) {
		checkPrim(12);
	}
	
}