package practice.d4;

public class $17MaxElemInMatrix {
    final static int N = 4;
    final static int  M = 4 ;
 
    // Function to find max element
    // mat[][] : 2D array to find max element
    static int findMax(int mat[][])
    {
 
        // Initializing max element as INT_MIN
        int maxElement = Integer.MIN_VALUE;
 
        // checking each element of matrix
        // if it is greater than maxElement,
        // update maxElement
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] > maxElement) {
                    maxElement = mat[i][j];
                }
            }
        }
 
        // finally return maxElement
        return maxElement;
    }
    public static void main(String args[])
    {
           // matrix
        int mat[][] = { 
		        					{ 01, 22, 13, 14 },
		        					{ 25, 16, 17, 18 },
		        					{ 49, 10, 11, 12 },
		        					{ 13, 14, 15, 16 } 
        					};
 
        System.out.println(findMax(mat)) ;
   
    }
}
