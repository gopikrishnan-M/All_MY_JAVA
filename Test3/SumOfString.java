package Test3;

public class SumOfString {
    public static void main(String[] args) {
        String s="abc123def456";
        int num1=Integer.parseInt(s.substring(3,6));
        int num2=Integer.parseInt(s.substring(9,s.length()));
        System.out.println(num1+num2);
    }
}
