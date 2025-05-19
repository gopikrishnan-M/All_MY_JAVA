package test4Training_Tcs;

import java.util.ArrayList;

public class ColorBallon {
    public static void main(String[] args) {
        char[] arr={'r','r','y','y','y','b','b','b','w'};
        ArrayList<Integer> occur=new ArrayList<>();
        char curr=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(curr==arr[i]){
                count++;
            }
            else {
                occur.add(count);
                curr=arr[i];
                count=1;
            }
        }
        occur.add(count);

        System.out.println(occur);
        for (int i = 0; i < occur.size(); i++) {
            if(occur.get(i)%2!=0){
                System.out.println(occur.get(i));
                break;
            }
        }
    }
}
