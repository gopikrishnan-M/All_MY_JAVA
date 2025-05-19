package Test_recursion;

public class ReversingNum {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(numReverser(n));
    }
    private static int numReverser(int n) {
        return revHelp(n,0);
    }
    private static int revHelp(int n, int rev) {
        if(n<=0) return rev;
        int last=n%10;
        return revHelp(n/10,rev*10+last);
    }
}
