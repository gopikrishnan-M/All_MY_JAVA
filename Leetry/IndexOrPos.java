package Leetry;

public class IndexOrPos {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3},2));
    }
    public static int searchInsert(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        if(target<arr[0]) return 0;
        if(target>arr[e]) return e+1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m]) return m;
            if(s==e){
                if(arr[s]>target) return s-1;
                else return s+1;
            }
            else if(target<arr[m]) e=m-1;
            else s=m+1;
        }
        return 0;

    }
}
