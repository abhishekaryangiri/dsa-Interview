package practice.d4;

import java.util.ArrayList;

public class $41SpiralMat {
	// Function to print in spiral order
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList()<Integer>();
 
        if (matrix.length == 0)
            return ans;
 
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
        
        
        
}
