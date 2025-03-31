package MathsRequirements;

import java.util.Arrays;

public class PrimeRange {
    public static void main(String[] args) {
        int n=30;
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        //Sieve of Eratosthenes
        /*
        * the time complexity of this is better coz
        * for every loop it makes n/2+n/3+n/4+.....n/Math.sqrt(n)
        * then the equation becomes n(1/2+1/3+1/4+....)
        * then   nx(this part is solved by taylor series formula and gives log(log n))
        * therefore the time complexity of this will be O(n*log(log n))*/
        for (int i = 2; i*i <=n; i++) {
           if(isPrime[i]){
               for (int j = i*i; j <=n ; j+=i) {
                   isPrime[j]=false;
               }
           }
        }
        for(int i=2;i< isPrime.length;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }

    }
}
