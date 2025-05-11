package Leetry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class LongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring3("asd  fghjkl;"));
    }
    public static int lengthOfLongestSubstring1(String s) {//😅 this approach has huge fail try to find
        int max=0;
        List<Character> noD=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!noD.contains(s.charAt(i))){
                noD.add(s.charAt(i));
            }
            else {
                max=Math.max(max,noD.size());
                noD=new ArrayList<>();
            }
        }
        return max=Math.max(max,noD.size());
    }

    public static int lengthOfLongestSubstring2(String s) {//this is the corrected one
        int max=0;
        List<Character> noD=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!noD.contains(s.charAt(i))){
                noD.add(s.charAt(i));
            }
            else {
                int indx=noD.indexOf(s.charAt(i));
                max=Math.max(max,noD.size());
                noD=new ArrayList<>(noD.subList(indx+1, noD.size()));
            }
        }
        return max=Math.max(max,noD.size());
    }

    public static int lengthOfLongestSubstring3(String s) {//most efficient that I have solved
        int max=0;
        int l=s.length();
        int front=0;
        Set<Character> sub=new HashSet<>();
        for(int i=0;i<l;i++){
            while(sub.contains(s.charAt(i))){
                sub.remove(s.charAt(front));
                front++;
            }
            sub.add(s.charAt(i));
            max=Math.max(max,i-front+1);
        }
        return max;
    }
}