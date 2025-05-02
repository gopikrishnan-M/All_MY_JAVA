package Test;

public class Prime {
    public static void main(String[] args) {
        int[] nums={8,10,3,12,7,15,11,2,17,26};
        for (int i = 0; i < nums.length; i++) {
            if(isprime(nums[i])){
                System.out.print(nums[i]+",");
            }
        }
    }
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
