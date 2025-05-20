package Test_recursion;

import java.util.ArrayList;

public class Combos {
    public static void main(String[] args) {
        char[] arr={'0','1'};
        int n=3;
        ArrayList<String> ans=new ArrayList<>();
        permuteWRep(new StringBuilder(""),arr,n,ans);
        for(String s:ans){
            if(isvald(s)) System.out.println(s);
        }
    }

    private static boolean isvald(String s) {
        int z=0,n=0;
        for(char c:s.toCharArray()){
            if(c=='0') z++;
            else n++;
        }
        return n>=z;
    }

    private static void permuteWRep(StringBuilder p,char[] arr,int n,ArrayList<String> ans) {
        if(p.length()>=n){
            ans.add(p.toString());
            return;
        }
        for(char c:arr){
            permuteWRep(p.append(c),arr,n,ans);
            p.deleteCharAt(p.length()-1);
        }
    }
}
