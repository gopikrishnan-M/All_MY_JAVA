package Test2;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] arr={"abc","car","madam","racecar","apple","aaaaaaaaaaaaaaaaa    "};
        int max=0;
        int pos=-1;
        for (int i = 0; i < arr.length; i++) {
            if(isPalindrome(arr[i])){
                if(max<arr[i].length()){
                    max=arr[i].length();
                    pos=i;
                }
            }
        }
        System.out.println(arr[pos]);
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}
