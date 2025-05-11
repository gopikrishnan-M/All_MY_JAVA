package Leetry;

public class CanJump55 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,2,0,1,3}));
    }
    public static boolean canJump(int[] nums) {
        int pos=nums.length-2;
        int val=0;
        boolean canJump=false;
        while(pos>=0){
            if(nums[pos]>val){
                canJump=true;
                pos--;
            }
            else{
                val++;
                pos--;
                canJump=false;
            }
        }
        return canJump;
    }

        public static boolean canJump2(int[] nums) {
            int goal = nums.length - 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                if (i + nums[i] >= goal) {
                    goal = i;
                }
            }
            return goal == 0;
        }

}
