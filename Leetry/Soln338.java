package Leetry;

import java.util.Arrays;

public class Soln338 {
    public static void main(String[] args) {
        /*int n=5;
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++){
            ans[i]=ans[i>>1]+(i&1);
        }
        System.out.println(Arrays.toString(ans));*/
        int n=7;
        System.out.println(n&1);
        System.out.println(n>>1);
    }
}
