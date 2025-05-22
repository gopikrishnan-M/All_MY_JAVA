package Test5;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr={21,12,13,-21,-2,2,5,4,45,-234};
        int n=arr.length;
        int csum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            csum=Math.max(csum,csum+arr[i]);
            max=Math.max(max,csum);
        }
        System.out.println(max);
    }
}

