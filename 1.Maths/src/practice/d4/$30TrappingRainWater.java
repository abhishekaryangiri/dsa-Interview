package practice.d4;

public class $30TrappingRainWater {
	// Function to return the maximum 
    // water that can be stored 
    public static int maxWater(int[] arr, int n) 
    { 
  
        // To store the maximum water 
        // that can be stored 
        int res = 0; 
  
        // For every element of the array 
        // except first and last element 
        
        for (int i = 1; i < n - 1; i++) { 
        	  
            // Find maximum element on its left 
            int left = arr[i]; 
            for (int j = 0; j < i; j++) { 
                left = Math.max(left, arr[j]); 
            } 
  
            // Find maximum element on its right 
            
            
            
}
