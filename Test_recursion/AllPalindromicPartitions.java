package Test_recursion;

import java.util.ArrayList;

public class AllPalindromicPartitions {
    public static void main(String[] args) {
        System.out.println(combList("","abb"));
    }
    private static void combo(String p, String up) {
        if(up.isEmpty()){
            if(isPal(p)) System.out.print(p+",");
            return;
        }
        char a=up.charAt(0);
        combo(p+a,up.substring(1));
        combo(p,up.substring(1));
    }
    private static ArrayList<String> combList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> temp= new ArrayList<>();
            if(isPal(p)) temp.add(p);
            return temp;
        }
        char a=up.charAt(0);
        ArrayList<String> left=combList(p+a,up.substring(1));
        ArrayList<String> right=combList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    private static boolean isPal(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
