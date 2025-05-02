package Test3;

public class OnlyAlfa {
    public static void main(String[] args) {
        String s="p@yt#hon123";
        char[]  arr=s.toCharArray();
        for (char c:arr) {
            if(Character.isLetter(c)){
                System.out.print(c);
            }
        }
    }

}
