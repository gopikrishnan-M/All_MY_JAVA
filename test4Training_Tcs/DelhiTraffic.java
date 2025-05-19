package test4Training_Tcs;

public class DelhiTraffic {
    public static void main(String[] args) {
        int[] arr={5,2,3,7,3,1,5};
        int date=12,fine=200,collection=0;
        for(int n:arr){
            if(!isSame(date,n)){
                collection+=fine;
            }
        }
        System.out.println(collection);
    }
    public static boolean isSame(int date,int number){
        if(date%2==0 && number%2==0) return true;
        if(date%2!=0 && number%2!=0) return true;
        return false;

    }
}
