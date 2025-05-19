package Test_recursion;

public class Factrl {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fctr(n));
    }

    private static int fctr(int n) {
        if(n<2) return 1;
        return n*fctr(n-1);
    }
}
