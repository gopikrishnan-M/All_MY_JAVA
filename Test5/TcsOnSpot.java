package Test5;

public class TcsOnSpot {
    public static void main(String[] args) {
        int m=7;
        int[] pArr=new int[m];
        int i=0;
        int temp=2;
        while(i<pArr.length){
            if(isPrime(temp)){
                pArr[i++]=temp;
            }
            temp++;
        }
        int val=pArr[pArr.length-1];
        int digit=(int)Math.log10(val)+1;
        int sum=0;
        while (digit>1){

            while (val>0){
                int last=val%10;
                sum+=last;
                val/=10;
            }
            digit=(int)Math.log10(sum)+1;
            val=sum;

        }
        System.out.println(val*pArr[pArr.length-1]);

    }
    public static boolean isPrime(int n){
        for (int i = 2; i <n ; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
