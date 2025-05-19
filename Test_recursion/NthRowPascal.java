package Test_recursion;

import java.util.ArrayList;

public class NthRowPascal {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> ans=new ArrayList<>();
        paskl(n,1,1,ans);
        System.out.println(ans);
    }

    private static void paskl(int row, int col, int num, ArrayList<Integer> ans) {
        if(col>=row+1) return;
        ans.add(num);
        paskl(row,col+1,num*(row-col)/col,ans);
    }
}
