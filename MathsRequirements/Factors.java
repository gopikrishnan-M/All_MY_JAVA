package MathsRequirements;

public class Factors {
    public static void main(String[] args) {
        int n=20;
        factors2(n);
        //if you want to print the factors in increasing order first print i and then add n/i to array list and finally
        // print'em in decreasing order so that it will be in correct order
    }
//O(sqrt(n))
    private static void factors2(int n) {
        for (int i = 1; i*i < n; i++) {
            if(n%i==0){
                System.out.println(i+"x"+ n/i +"  and vise versa");
            }
        }
    }
// O(n)
    private static void factors1(int n) {
        for (int i = 1; i <= n ; i++) {
            if(n%i==0){
                System.out.print(i+ "  ");
            }

        }
    }
}
