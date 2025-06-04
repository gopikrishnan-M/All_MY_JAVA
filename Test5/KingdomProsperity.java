package Test5;

public class KingdomProsperity {
    public static void main(String[] args) {
        int[] arr={4, -1, 2, 1, -5, 4, 3, -2, 6, -1, 2};
        int n= arr.length,k=1,i=1,max=Integer.MIN_VALUE;
        while (i<=n-k-1){
            int temp=maxsum(arr,0,i)+maxsum(arr,i+k,n);
            max=Math.max(temp,max);
            i++;
           int ij=0;
        }
        System.out.println(max);
    }
    private static int maxsum(int[] arr,int s,int e){
        int csum=arr[s],msum=arr[s];
        for (int i=s+1;i<e;i++){
            csum=Math.max(csum+arr[i],arr[i]);
            msum=Math.max(csum,msum);
        }
        return msum;
    }
}
