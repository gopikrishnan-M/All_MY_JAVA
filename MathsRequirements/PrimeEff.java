package MathsRequirements;

public class PrimeEff {
    public static void main(String[] args) {
        int n=20;
        for (int i = 0; i < n; i++) {
            System.out.println(i+" "+isPrime(i));
        }
    }
//this way is efficient(O(n*Math.sqrt(n))) than bruteforce approach which takes n*n complexity but less efficient than seive eratosthenes
    private static boolean isPrime(int i) {
        int c=2;
        if(i<=1){
            return false;
        }
        while(c*c<=i){
            if(i%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
