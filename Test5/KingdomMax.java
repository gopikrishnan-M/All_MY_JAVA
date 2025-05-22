package Test5;

import java.util.Arrays;

public class KingdomMax {
    public static void main(String[] args) {
        int [] arr={5, 5, -1, -2, 3, -1, 2, -2};
        int k=3;
        int fmax=Integer.MIN_VALUE;
        int[] fa=new int[2];

        int smax=Integer.MIN_VALUE;
        int[] sa=new int[2];

        int tmax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length-1;i++){
            int startSecond=i+k+1;
            if(startSecond>=arr.length) break;
            int[] first=finder(arr,0,i);
            int[] second=finder(arr,startSecond,arr.length-1);
            if(first[2]+second[2]>tmax){
                fmax=first[2];
                fa[0]=first[0];
                fa[1]=first[1];


                smax=second[2];
                sa[0]=second[0];
                sa[1]=second[1];

                tmax=first[2]+second[2];
            }
        }
        if (fmax == Integer.MIN_VALUE || smax == Integer.MIN_VALUE) {
            System.out.println("No valid two subarrays with given gap.");
        } else {
            System.out.println("First Subarray: " + Arrays.toString(fa));
            System.out.println("Second Subarray: " + Arrays.toString(sa));
            System.out.println("Max Combined Sum: " + (fmax + smax));
        }
    }
    public static int[] finder(int[] arr,int s,int e){
        int csum=arr[s];
        int msum=arr[s];
        int ms=s,tmps=s,me=s;
        for(int i=s+1;i<=e;i++){
            if(arr[i]>csum+arr[i]){
                csum=arr[i];
                tmps=i;
            }else {
                csum+=arr[i];
            }
            if(csum>msum){
                msum=csum;
                ms=tmps;
                me=i;
            }
        }
        return new int[] {ms,me,msum};
    }

    public static int prosperity(int[] arr,int s,int e){
        int sum=0;
        for (int i = s; i <=e ; i++) sum+=arr[i];
        return sum;
    }
}
