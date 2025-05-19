package Test_recursion;

public class HcfNLcm {
    public static void main(String[] args) {
        int a=7;
        int b=2;
        System.out.println(hcf(a,b));
        System.out.println(lcm(a,b));
    }
    private static int hcf(int a,int b){
        if(a%b==0){
            return b;
        }
        return hcf(b,a%b);
    }
    private static int lcm(int a,int b){
       return a*b/hcf(a,b);
    }
}
