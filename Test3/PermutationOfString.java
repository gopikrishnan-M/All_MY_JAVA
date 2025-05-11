package Test3;

public class PermutationOfString {
    public static void main(String[] args) {
        permuter("","abc");

    }

    private static void permuter(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char a=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permuter(f + a + s,up.substring(1));
        }
    }
}
