package Test3;

public class CommonSub {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ab";
        int count=0;
        for (int i = 0; i < s2.length(); i++) {
            if(s1.indexOf(s2.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
