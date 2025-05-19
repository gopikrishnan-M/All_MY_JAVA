package test4Training_Tcs;

public class Curtains {
    public static void main(String[] args) {
        String s="bbbaaababa";
        int count=0,max=0,i=0,l=3;
        char[] arr=s.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            if(i>=l){
                max=Math.max(count,max);
                i=0;
                count=0;
            }
            if(arr[j]=='a') count++;
            i++;
        }
        System.out.println(max);
    }
}
