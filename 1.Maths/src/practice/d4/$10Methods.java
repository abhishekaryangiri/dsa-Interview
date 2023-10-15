package practice.d4;

public class $10Methods {

	/*
	Methods are of 2 types:-
	1. User-defined
	2. In-built
	
	1. User-defined - like factorial, sum, mul, sub ,etc.
	2. In-built method -there is a predefined class i.e, Math has multiple inbuilt methods like power, 
	    sqrt,etc
	 */
	
	// method to calculate sum of two no:
	static int sum(int x,int y) {
		return x+y;
	}
	
	//method to calculate sum of 3 no:
	static int sum(int x,int y,int z) {
		return x+y+z;
	}
	
	//method to calculate int sum of 2 no:
	static float  sum(float x,float y ) {
		return x+y;
	}
	// method to find prime no:
	static boolean isPrime(int n) {
		boolean isPrime=true;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				isPrime= false;
				break;
			}
			
		}
		return isPrime;
	}
	public static void main(String[] args) {
		
		System.out.println(sum(34,89));
		
		System.out.println(sum(67,4755,756));
		
		System.out.println(sum(4.56f,556.76f));
		
		System.out.println(isPrime(9));
	}
	 
	 
}
