package Leetry;

import java.util.Arrays;
import java.util.Stack;

public class TwoStackGame {
    public static void main(String[] args) {
        System.out.println(mostChance(10,new int[] {2,2,3},new int[] {3,3,5}));
    }

    private static int mostChance(int max,int[]one,int[]two) {
        return mostChance(max,one,two,0,0)-1;
    }

    private static int mostChance(int max,int[]one,int[]two,int sum,int count){
        if(sum>max||one.length==0||two.length==0) return count;
        int ans1=mostChance(max,Arrays.copyOfRange(one,1,one.length),two,sum+one[0],count+1);
        int ans2=mostChance(max,one,Arrays.copyOfRange(two,1,two.length),sum+two[0],count+1);
        return Math.max(ans1,ans2);
    }

}
