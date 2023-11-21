package practice.d4;

public class $21SmallestPrimeNum {
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
    
    
}
