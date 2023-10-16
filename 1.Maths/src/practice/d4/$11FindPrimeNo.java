package practice.d4;

public class $11FindPrimeNo {
  static boolean isPrime(int n) {
	  
	/*
	 * for(int i=2;i<=n-1;i++) { if(n%i==0) { return false; } } return true; }
	 */
	  if(n==2) {
		  return true;
	  }
	  // using Math class find prime no:
		 for(int i=2;i<=Math.sqrt(n);i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }
  public static void main(String[] args) {
	System.out.println(isPrime(3));
}
}
