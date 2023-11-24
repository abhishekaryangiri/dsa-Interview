package practice.d4;

public class $24SmallestPrime {
	
	// Function to check if the number is a prime or not
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
 
    // Function to find the smallest prime in a range
    public static int minPrimeRange(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (isPrime(i))
                return i;
        }
        return -1;
    }
 // Driver code
    public static void main(String[] args) {
        int L = 14, R = 19;
 
        // Function call
        int ans = minPrimeRange(L, R);
        System.out.println(ans);
    }
}
