package test4Training_Tcs;

public class HashStarCounter {
    public static void main(String[] args) {
        String s="###******";
        int stars=0,hash=0;
        for(char c:s.toCharArray()){
            if(c=='*') stars++;
            if(c=='#') hash++;
        }
        System.out.println(stars-hash);
    }
}
