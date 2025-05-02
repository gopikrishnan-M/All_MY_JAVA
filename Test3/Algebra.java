package Test3;

public class Algebra {
    public static void main(String[] args) {
        String s="(x+y)*(a+b)";
        s=s.replaceAll("()","");
//        StringBuilder sb=new StringBuilder(s);
//        sb.deleteCharAt(0);
//        sb.deleteCharAt(3);
//        sb.deleteCharAt(4);
//        sb.deleteCharAt(7);
        System.out.println(s);
    }
}
