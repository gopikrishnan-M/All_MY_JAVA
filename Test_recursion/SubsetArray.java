package Test_recursion;

import java.util.ArrayList;

public class SubsetArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(sumOfSubset(arr,0,0,0));
    }

    private static ArrayList<Integer> sumOfSubset(int[] arr,int i,int j,int sum) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(i>=arr.length){
            return ans;
        }
        if(j>=arr.length){
            sum=0;
            i=i+1;
            j=i;
        }
        if(j>=arr.length) return ans;
        sum=sum+arr[j++];
        ans.add(sum);
        ans.addAll(sumOfSubset(arr,i,j,sum));
        return ans;
    }
}
