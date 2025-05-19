package Test_recursion;

public class Combos {
    public static void main(String[] args) {
        char[] arr={'0','1'};
        int n=3;
        permuteWRep(new StringBuilder(""),arr,n);
    }

    private static void permuteWRep(StringBuilder p,char[] arr,int n) {
        if(p.length()>=n){
            System.out.println(p);
            return;
        }
        for(char c:arr){
            permuteWRep(p.append(c),arr,n);
            p.deleteCharAt(p.length()-1);
        }
    }
}
