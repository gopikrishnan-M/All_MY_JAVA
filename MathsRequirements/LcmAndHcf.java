package MathsRequirements;

public class LcmAndHcf {
    public static void main(String[] args) {
        System.out.println(lcm(2,7));//smallest number that is divisible by both a,b
        System.out.println(hcf(2,7));//largest number that divides both a,b
    }

    private static int lcm(int a, int b) {
        return a*b/hcf(a,b);
    }

    private static int hcf(int a, int b) {
        if(a%b==0) return b;
        return hcf(b,a%b);
    }
}
