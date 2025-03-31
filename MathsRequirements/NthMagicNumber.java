package MathsRequirements;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n=6;
        int magic=0;
        int i=1;
        while (n>0){
            int last=n&1;            //my way
            magic+=last*Math.pow(5,i);
            i++;
            n=n>>1;
        }
        /*int base=5;
        while(n>0){
            int lst=n&1;
            magic+=lst*base;       //kunal's way both are correct
            base*=5;
            n=n>>1;
        }*/
        System.out.println(magic);
    }
}
