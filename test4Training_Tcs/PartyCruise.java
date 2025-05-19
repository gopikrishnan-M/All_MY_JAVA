package test4Training_Tcs;

public class PartyCruise {
    public static void main(String[] args) {
        int[] in={7,0,5,1,3};
        int[] out={1,2,1,3,4};
        int max=0,curr=0;
        for (int i = 0; i < in.length; i++) {
            curr=curr+in[i]-out[i];
            max=Math.max(max,curr);
        }
        System.out.println(max);
    }
}
