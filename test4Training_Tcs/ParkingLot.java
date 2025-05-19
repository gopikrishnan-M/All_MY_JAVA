package test4Training_Tcs;

public class ParkingLot {
    public static void main(String[] args) {
        int[][] arr={
                {1,0,0},
                {1,0,1},
                {1,1,1}
        };
        int max=0;
        for(int[] row:arr){
            int count=0;
            for(int n:row){
                if(n==1) count++;
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
