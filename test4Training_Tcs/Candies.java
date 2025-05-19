package test4Training_Tcs;

public class Candies {
    public static void main(String[] args) {
        int capacity=10;//input section
        int atleast=5;//input section
        int sell=0;//input section

        if(sell==0||sell>=capacity-atleast) System.out.println("INVALID INPUT");
        else {
            System.out.println("SOLD CANDIES : "+ sell);
            System.out.println("AVAILABLE CANDIES : "+ (capacity-sell));
        }

    }
}
