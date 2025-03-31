package Learnings;

public class SwapUsingXR {
    public static void main(String[] args) {
        int a=32;
        int b=65;
        System.out.println("the value of a :" + a);
        System.out.println("the value of b :" + b);
        a^=b;
        b^=a;
        a^=b;
        System.out.println("the value of a after swap :" + a);
        System.out.println("the value of b after swap :" + b);
    }
}
