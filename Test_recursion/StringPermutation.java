package Test_recursion;

public class StringPermutation {
    public static void main(String[] args) {
        permuteString("","abc","abc");
    }

    private static void permuteString(String p, String up,String org) {
        if(up.isEmpty()) {
            if(!org.equals(p)) System.out.println(p);
            return;
        }
        char a=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            permuteString(f + a + l , up.substring(1),org);
        }
    }
}
