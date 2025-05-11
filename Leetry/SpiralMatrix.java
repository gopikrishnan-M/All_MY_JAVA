package Leetry;
import java.util.*;

class SpiralMatrix {

    public static void main(String[] args) {
        int[][] mat={
                {0,0,0,0,0},
                {3,4,4,4,1},
        };
        System.out.println(spiralOrder(mat));

    }
    public static List<Integer> spiralOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        List<Integer> ans=new ArrayList<>(m*n);
        boundary(mat,ans,0,mat.length-1,0,mat[0].length-1);
        return ans;
    }
    public static void boundary(int[][] mat,List<Integer> ans,int rs,int re,int cs,int ce){
        if(rs>re||cs>ce){//basic just do it
            return;
        }

        //doing what they asked for top row
        for(int i=cs;i<=ce;i++){
            ans.add(mat[rs][i]);
        }
        rs++;

        //last col
        for(int i=rs;i<=re;i++){
            ans.add(mat[i][ce]);
        }
        ce--;

        //last row
        if (rs <= re) {
            for(int i=ce;i>=cs;i--){
                ans.add(mat[re][i]);
            }
            re--;
        }


        if(cs<=ce){
            for(int i=re;i>=rs;i--){
                ans.add(mat[i][cs]);
            }
            cs++;
        }

        boundary(mat, ans, rs, re, cs, ce);

        //boundary(mat,ans,rs+1,re-1,cs+1,ce-1);we need check in between weather the elements are still
        //there or not so eliminate traversed elements soon after every loop
    }
}