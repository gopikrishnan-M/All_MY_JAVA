package MathsRequirements;

public class SetResetNthBit {
    public static void main(String[] args) {
        int num=17;// binary value of 17 is 10001
        int n=3;
        int m=2;
//        setbit(num,n);     // this will set the third bit from left to one 10101
        resetbit(num,m);
    }

    private static void resetbit(int num, int m) {
//        System.out.println(num&((1<<(m-1))^1));
        System.out.println(num&((1<<(m-1))&0));
    }

    private static void setbit(int num, int n) {
        System.out.println(num|(1<<(n-1)));
    }
}
