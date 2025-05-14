package test4Training;

public class Toggle {
    public static void main(String[] args) {
        int n=10;
        int len=Integer.toBinaryString(n).length();
        int mask=(1<<len)-1;
        System.out.println(n^mask);
    }
}
