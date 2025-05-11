package Leetry;

import java.util.Stack;

class SingleOpenDoubleClose {
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))(()))(()"));
    }
    public static int minInsertions(String s) {
        int i=0;
        int open=0;
        int insert=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                open++;
                i++;
            }
            else{
                if(i+1<s.length()&&s.charAt(i+1)==')'){
                    i+=2;
                }
                else{
                    insert++;
                    i++;
                }
                if(open>0) open--;
                else insert++;
            }
        }
        return insert+open*2;
    }
}