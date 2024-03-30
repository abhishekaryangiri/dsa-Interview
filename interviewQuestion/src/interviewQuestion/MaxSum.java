package interviewQuestion;
public class MaxSum {
	 public static int findingmaxSum(int[] num) {
	        int currSum = num[0];
	        int maxSum = num[0];

	        for (int i = 1; i < num.length; i++) {
	            currSum = Math.max(num[i], currSum + num[i]);
	            maxSum = Math.max(maxSum, currSum);
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
	        int result = findingmaxSum(arr);

	        System.out.println("Max subarray sum: " + result);
	    }
}
