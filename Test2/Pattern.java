package Test2;

public class Pattern {
    public static void main(String[] args) {
        int num=1;
        int star=0;
        for (int row = 1; row <=6 ; row++) {
            for (int col = 1; col <= row ; col++) {
                star++;
                if(star%2!=0) {
                    System.out.print(num);
                    num++;
                }
                else System.out.print("*");

            }
            System.out.println();

        }
    }
}
