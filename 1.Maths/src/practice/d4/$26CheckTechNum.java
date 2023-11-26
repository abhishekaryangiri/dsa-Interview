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
}
