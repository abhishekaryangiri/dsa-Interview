package practice.d4;

public class $26CheckTechNum {
    // Function to count the
    // number of digits in a number
    static int countDigits(int n)
    {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
 
    // Returns true if n is a tech
    // number, else false
    
    static boolean isTech(int n)
    {
        // Count the number of digits
        int count = countDigits(n);
 
        // Return false if digits are odd
        if (count % 2 != 0)
            return false;
 
        // Split the number in two
        // equal halve and store their sum
        
        int half = count / 2;
        int first_half = n / (int)Math.pow(10, half);
        int second_half = n % (int)Math.pow(10, half);
        int sum = first_half + second_half;
 
        // Check if the square of the sum
        // is equal to the original number
        if ((sum * sum) == n)
            return true;
        else
            return false;
    }
 
}
