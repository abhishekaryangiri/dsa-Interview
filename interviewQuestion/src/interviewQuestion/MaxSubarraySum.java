package interviewQuestion;

public class MaxSubarraySum {
	public static int maxSubarraySum(int[] num) {
        int currentSum = num[0];
        int maxSum = num[0];
        for (int i = 1; i < num.length; i++) {
            currentSum = Math.max(num[i], currentSum + num[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = maxSubarraySum(arr);

        System.out.println("Maximum subarray sum: " + result);
    }
}
