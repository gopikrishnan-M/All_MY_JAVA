package Test_recursion;

public class RemoveAdjDup {
    public static void main(String[] args) {
        String s="krriisshnnaan  ggooppii";
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));
        /*for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans.append(s.charAt(i));
            }
        }*/
        System.out.println(corrector(s,ans,1));

    }

    private static StringBuilder corrector(String s,StringBuilder ans,int i) {
        if(i>=s.length())return ans;
        if(s.charAt(i)!=s.charAt(i-1)){
            ans.append(s.charAt(i));
        }
        return corrector(s,ans,i+1);
    }
}
