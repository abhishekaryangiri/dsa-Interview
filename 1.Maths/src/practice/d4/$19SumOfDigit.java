package practice.d4;

public class $19SumOfDigit {
	 /* Function to get sum of digits */
    static int getSum(int n)
    {
        int sum = 0;
 
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
 
        return sum;
    }
    // Driver code

    public static void main(String[] args)
    {
        int n = 687;
 
        // Function call
        System.out.println(getSum(n));
}
}