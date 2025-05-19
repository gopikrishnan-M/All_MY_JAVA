package test4Training_Tcs;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"" +((char) (i+64)));
            }
            System.out.println();
        }
    }
}
