package Leetry;

public class Robber {
    public static void main(String[] args) {
        int[] nums = {6, 7, 1, 30, 8, 2, 4};
        System.out.println(rob2(nums));

    }
    public static int rob1(int[] nums) {
        int i=0,osum=0,esum=0;
        while(i<nums.length){
            if((i&1)==1) osum+=nums[i++];
            else esum+=nums[i++];
        }
        return Math.max(osum,esum);
    }

    public static int rob2(int[] arr){
        int n=arr.length;
        int[] greedy=new int[n];
        greedy[0]=arr[0];
        greedy[1]=Math.max(arr[0],arr[1]);
        for (int i = 2; i < n; i++) {
            greedy[i]=Math.max(greedy[i-1],greedy[i-2]+arr[i]);
        }
        return greedy[n-1];
    }
}
