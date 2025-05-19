package Test_recursion;

public class FctorialLastNonzero {
    public static void main(String[] args) {
        int n=5;
        int fct=fctrl(n);
        System.out.println(lastNonZero(fct));
    }

    private static int lastNonZero(int n) {
        if(n<=0) return 0;
        int last=n%10;
        if(last!=0) return last;
        return lastNonZero(n/10);
    }

    private static int fctrl(int n) {
        if(n<2) return 1;
        return n*fctrl(n-1);
    }
}
