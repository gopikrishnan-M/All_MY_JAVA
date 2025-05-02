package Test;

public class Pattern {
    public static void main(String[] args) {
        String s="program";
        int f=0;
        int b=s.length()-1;
        for (int i = 1; i < 8 ; i++) {
            for (int j = 1; j < 8; j++) {
                if(i==j){
                    System.out.print(s.charAt(f++));
                }
                if(i+j==7+1){
                    if(s.charAt(b)=='g'){
                        b--;
                    }
                    else
                    System.out.print(s.charAt(b--));
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
