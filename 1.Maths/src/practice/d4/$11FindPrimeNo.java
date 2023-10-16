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
  
  // print all prime no in a range
  public static void primeInRange(int n) {
	  for(int i=2;i<n;i++) {
		  if(isPrime(i)) {
			  System.out.print(i+" ");
		  }
	  }
	  System.out.println();
  }
  
  public static void main(String[] args) {
	System.out.println(isPrime(3));
	
	primeInRange(56);
}
}
