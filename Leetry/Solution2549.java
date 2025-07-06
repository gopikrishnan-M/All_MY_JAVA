package Leetry;

class Solution2549 {
    public static void main(String[] args) {
        System.out.println(helper(5,1,false,false,5));
    }
    public static int helper(int val,int ans,boolean seen,boolean last,int org){
        if(val<3 && seen && last) return ans;
        if(val==2&& !seen) return helper(val,ans+1,true,last,org);
        for(int i=2;i<val;i++){
            if(val%i==1) return helper(i,ans+1,seen,i==(org-1),org);
        }
        return ans;
    }
}