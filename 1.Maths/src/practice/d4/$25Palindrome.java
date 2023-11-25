package practice.d4;

public class $25Palindrome {
	// A function that returns true 
    // only if num contains one digit 
    public static int oneDigit(int num) { 
   
        if ((num >= 0) && (num < 10)) 
            return 1; 
        else
            return 0; 
    } 
   
    public static int isPalUtil 
    (int num, int dupNum) throws Exception { 
   
    	
    	 // base condition to return once we  
        // move past first digit 
        if (num == 0) { 
            return dupNum; 
        } else { 
            dupNum = isPalUtil(num / 10, dupNum); 
        } 
   
        // Check for equality of first digit of 
        // num and dupNum 
        if (num % 10 == dupNum % 10) { 
            // if first digit values of num and  
            // dupNum are equal divide dupNum 
            // value by 10 to keep moving in sync 
            // with num. 
        	
        	
}
