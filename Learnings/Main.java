package Learnings;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            int k=0;
            int[] arr ={1,2,3,2,3,5,1,5,9,4,2,6,8,2,5};
            int[] occur=new int[10];
            int[] res=new int[arr.length];
            for(int i=0;i< arr.length;i++){
                occur[arr[i]]++;
            }
            for(int i=0;i< occur.length;i++){
                if(occur[i]>0){
                    res[k++]=i;
                }
            }
            System.out.println(Arrays.toString(res));
        }


    public static void decimalToOther(){
        String binar="1010";
        int val=Integer.parseInt(binar,2);//indha 2 base value 2-binary,10-decimal,16-hexadec
        System.out.println(val);                //Above func convert binary to integer;
        int a=10;
        String b=Integer.toBinaryString(a);
        String hex=Integer.toHexString(a).toUpperCase();
        System.out.println(b);
        System.out.println(hex);

    }


    public static void some(){
        String s="goiyaala";
        StringBuilder sb=new StringBuilder(s);
        String reversed=sb.reverse().toString();
        System.out.println(reversed);
    }
}
