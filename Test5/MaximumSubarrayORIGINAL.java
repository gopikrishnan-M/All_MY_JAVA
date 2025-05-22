package Test5;

public class MaximumSubarrayORIGINAL {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = maxSubarray(arr);
        System.out.println("Start index: " + result[0]);
        System.out.println("End index: " + result[1]);
        System.out.println("Maximum sum: " + result[2]);
    }

    public static int[] maxSubarray(int[] nums) {
            int maxSum = nums[0];
            int currentSum = nums[0];
            int start = 0, end = 0, tempStart = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > currentSum + nums[i]) {
                    currentSum = nums[i];
                    tempStart = i;
                } else {
                    currentSum += nums[i];
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                }
            }

            return new int[] {start, end, maxSum};
        }
}
