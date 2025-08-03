package SecondWave;

import java.util.ArrayList;

public class Functions {
    public static int kris=21;
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(0-10));

    }
    public static void printer(){
        kris=12;
//        System.out.println(kris);
    }
    private static int printer(int c){
        kris=124;
        return 6;
//        System.out.println(kris);
    }
    public static void  swap(int firstnum,int secondnumber){
        int temp=firstnum;
        firstnum=secondnumber;
        secondnumber=temp;
    }
}
