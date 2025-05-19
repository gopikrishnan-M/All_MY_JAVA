package Test_recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n=3;
        int power=3;
        System.out.println(pow(n,power));
    }
    public static int pow(int n,int p){
        if(p<=0){
            return 1;
        }
        return n*pow(n,p-1);
    }
}
