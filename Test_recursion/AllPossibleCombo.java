package Test_recursion;

import java.util.ArrayList;

public class AllPossibleCombo {
    public static void main(String[] args) {
        String s="1234";
//        combo("",s);
        System.out.println(combList("",s));
    }

    private static void combo(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p+",");
            return;
        }
        char a=up.charAt(0);
        combo(p+a,up.substring(1));
        combo(p,up.substring(1));
    }
    private static ArrayList<String> combList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> temp= new ArrayList<>();
            temp.add(p);
            return temp;
        }
        char a=up.charAt(0);
        ArrayList<String> left=combList(p+a,up.substring(1));
        ArrayList<String> right=combList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
