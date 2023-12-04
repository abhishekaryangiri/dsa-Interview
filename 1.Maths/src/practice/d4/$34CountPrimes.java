package practice.d4;

public class $34CountPrimes {
	// Function to find count of prime
    static int primeCount(int arr[], int n)
    {
        // Find maximum value in the array
        //.*max_element(arr, arr+n);
        int max_val = Arrays.stream(arr).max().getAsInt();
 
        // USE SIEVE TO FIND ALL PRIME NUMBERS LESS
        // THAN OR EQUAL TO max_val
        // Create a boolean array "prime[0..n]". A
        // value in prime[i] will finally be false
        // if i is Not a prime, else true.
        Boolean[] prime = new Boolean[max_val + 1];
        for (int i = 0; i < max_val + 1; i++) 
        {
            prime[i] = true;
        }
}
