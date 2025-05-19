package Test_recursion;

public class FibancciNumber {
    public static void main(String[] args) {
        System.out.println(fiba(10));
    }

    private static int fiba(int n) {
        if (n < 2) {
            return n;
        }
        return fiba(n-1)+fiba(n-2);
    }
}
