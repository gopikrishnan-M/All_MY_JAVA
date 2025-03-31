package MathsRequirements;

public class NoOfSetBits {
    public static void main(String[] args) {
        int num=10;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setCounter(num));
        //or simply we can left shift until the value reaches zero and count ++
    }

    private static int setCounter(int num) {
        int count=0;
        while (num>0){
            num=num&(num-1);
            count++;

        }
//           (or)
/*      while(num>0){
        num-=(n&-n);
        count++;
        }*/
        return count;

    }
}
