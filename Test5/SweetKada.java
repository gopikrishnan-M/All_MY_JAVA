package Test5;
import java.util.ArrayList;
import java.util.HashSet;

public class SweetKada {
    public static void main(String[] args) {
        int total=3;
        int[] p1={1,2,3,4,5,6};
        int[] p3={3,3,3,4,4,4,5,5,5};
        ArrayList<int[]> players=new  ArrayList<>();
        players.add(p1);
        players.add(p3);
        int max=0,mind=-1,i=0;
        for(int[] arr:players){
            if(points(arr)>max){
                max=points(arr);
                mind=i;
            }
            i++;
        }
        System.out.println(max + " player : "+ i);
    }
    private static int points(int[] arr) {
        int points=arr.length;
        HashSet<Integer> noD=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            noD.add(arr[i]);
        }
        int s=noD.size();
        if(s==4) points+=1;
        else if(s==5) points+=2;
        else if(s>=6)points+=s;
        return points;
    }
}
