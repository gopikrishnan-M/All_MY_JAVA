package Test_recursion;

public class AllValidNParanthesis {
    public static void main(String[] args) {
        int n=5;
        valider(n,0,0,"");
    }

    private static void valider(int max, int open, int close,String ans) {
        if(ans.length()>=2*max) {
            System.out.println(ans);
            return;
        }
        if(open<max) valider(max,open+1,close,ans+'(');
        if(open>close) valider(max,open,close+1,ans+')');
    }
}
