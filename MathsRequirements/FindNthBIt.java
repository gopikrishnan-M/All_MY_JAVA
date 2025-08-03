package MathsRequirements;

public class FindNthBIt {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPowerOfTwo(64));
//        int n=2;//nth bit from the left side
//        System.out.println(num&(1<<(n-1)));
    }
    public static boolean isPowerOfTwo(int n) {
        int val=n-1;
        return n > 0 && (n & (val)) == 0;
    }

}
