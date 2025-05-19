package test4Training_Tcs;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={4,5,0,1,9,0,5,0};
        Arrays.sort(arr);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int a,int b,int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void moveZeroeseff(int[] nums) {
        int index=0,l=nums.length;
        for (int i=0;i<l;i++){
            if (nums[i] != 0) {
                nums[index++]=nums[i];
            }
        }
        for (int i = index; i < l ; i++) {
            nums[i]=0;
        }
    }

    public static void moveZeroes(int[] nums) {
        int l=nums.length;
        int values=1;
        int []ans=new int[l];
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                values=0;
                break;
            }
        }
        if(values==0){
            for(int i=0,k=0;i<l;i++){
                if(0!=nums[i]){
                    ans[k]=nums[i];
                    k++;
                }

            }
        }
        for(int i=0;i<l;i++){
            if(values==0)
                nums[i]=ans[i];
        }

    }
}

