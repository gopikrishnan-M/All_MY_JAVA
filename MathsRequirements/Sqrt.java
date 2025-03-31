package MathsRequirements;
/*
 Binary Search Phase: O(log n)
 Precision Phase: O(point)

Total Complexity: O(log n + point)
*/

public class Sqrt {
    public static void main(String[] args) {
        //simply keep incrementing i from 1 till less than n if i*i is equal to n then return it
        //but when we are searching for an element in a sorted set of elements then we can use binary search :)
        int num=20;
        int point=3;
        System.out.printf("%.3f",bSrch(num,point));;
    }

    private static double bSrch(int num, int point) {
       int s=0;
       int e=num;
       double increment=0.1;
       double root=0.0;
       while (s<=e){
           int m=s+(e-s)/2;
           if(m*m==num){
               return m;
           }
           else if (m * m > num) {
               e=m-1;
//               root=m;
           }
           else {
               s=m+1;
               root=m;
           }
       }
//now below commented might be useless coz of assigning only the smaller value to the root .
/*       while(root*root>=num && root>0){ //this loop counters when the binary search fails with greater root value
           //if it enters with greater value in the below for loop then the while loop inside it fails for every increment
           //until point is reached which ultimately results in wrong answer
           root-=increment;
       }*/
       for(int i = 0 ; i < point ; i++ ){
           while (root*root<=num){
               root+=increment;
           }
           root-=increment;
           increment/=10;
       }
       return root;
    }
}
