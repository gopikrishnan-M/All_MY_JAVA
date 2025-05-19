package test4Training_Tcs;

public class Vehicle {
    public static void main(String[] args) {
        int vehicle=200;
        int wheels=540;
        if((wheels-2*vehicle)%2==0){
            System.out.println("the number of two wheelers are : " + (wheels-2*vehicle)/2);
            System.out.println("the number of four wheelers are : " + (vehicle-((wheels-2*vehicle)/2)));
        }
        else System.out.println("INVALID INPUT");
    }
}
