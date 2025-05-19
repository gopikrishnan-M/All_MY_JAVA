package Test_recursion;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=12;
        System.out.println(PorNot(n));
    }

    private static boolean PorNot(int n) {
        if(n<2) return false;
        return isPrime(n,2);
    }
    private static boolean isPrime(int n,int srt){
        if (srt * srt > n) {
            return n%srt!=0;
        }
        return n%srt!=0&&isPrime(n,srt+1);

    }
}
