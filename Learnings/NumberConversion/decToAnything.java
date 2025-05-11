package Learnings.NumberConversion;

public class decToAnything {
    public static void main(String[] args) {
        int num=12;
        System.out.println(decToBin(num));
        System.out.println(decToOct(num));
        System.out.println(decToHex(num));
    }
    public static String decToBin(int num){
//        String binary=Integer.toBinaryString(num);
        StringBuilder bin=new StringBuilder();

        while(num>0){
            bin.insert(0,num%2);
            num/=2;
        }
        return bin.length()>0?bin.toString():"0";
    }

    public static String decToOct(int num){
//        String Octal=Integer.toOctalString(num);
        StringBuilder oct=new StringBuilder();
        while (num > 0) {
            oct.insert(0,num%8);
            num/=8;
        }
        return oct.length()>0?oct.toString():"0";
    }

    public static String decToHex(int num){
//        String hexadecimal=Integer.toOctalString(num);
        StringBuilder hex=new StringBuilder();
        char[] arr="0123456789ABCDEF".toCharArray();
        while (num > 0) {
            hex.insert(0,arr[num%16]);
            num/=16;
        }
        return hex.length()>0?hex.toString():"0";
    }

}
