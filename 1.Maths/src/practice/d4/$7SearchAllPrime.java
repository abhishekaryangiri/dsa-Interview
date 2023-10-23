package practice.d4;

public class $7SearchAllPrime {
	
	public static boolean checkPrim(int x) {
		boolean checkPrim=true;
		for( int a=2; a<=x-1; a++) {
			if(x%a==0) {
				checkPrim=false;
				break;
			}
		}
		return checkPrim;
	}
	public static void  rangeOn(int  z) {
		
		for( int b=2; b<=z; b++) {
			if(checkPrim(b)) {
				System.out.print(b+ " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("prime in given arrays: ");
		rangeOn(29);	
		}
}
