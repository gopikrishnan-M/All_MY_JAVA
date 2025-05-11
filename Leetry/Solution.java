package Leetry;

class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(10));
        int a=21;

    }
    public static int numberOfMatches(int n) {
        int count=0;
        while(n>1){
            if((n&1)==1){
                count+=(n-1)/2;
                n=(n-1)/2+1;
            }
            else{
                count+=n/2;
                n/=2;
            }
        }
        return count;
    }
}