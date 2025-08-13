package Leetry;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] {3,6,7,11},8));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int ans=1;
        int max= Arrays.stream(piles).max().getAsInt();
        while (min<=max){
            int mid=min+(max-min)/2;
            if (canEat(piles, h, mid)) {
                max=mid-1;
                ans=mid;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    public static boolean canEat(int[] arr,int h,int chk){
        for(int i=0;i<arr.length;i++){
            if (h < 0 ) {
                return false;
            }
            h=h-Math.ceilDiv(arr[i],chk);
        }
        return !(h<0);
    }
}