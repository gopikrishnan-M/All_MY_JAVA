package test4Training_Tcs;

public class OxygenLevel {
    public static void main(String[] args) {
        int[] oxy={95,92,95,92,90,92,90,92,90,92};
        int i=0;
        int t1=(oxy[0]+oxy[3]+oxy[6])/3;
        int t2=(oxy[1]+oxy[4]+oxy[7])/3;
        int t3=(oxy[2]+oxy[5]+oxy[8])/3;
        if(t1>70) System.out.println("Trainer number one");
        if(t2>70) System.out.println("Trainer number two");
        if(t3>70) System.out.println("Trainer number three");
        if(t1<70 && t2<70 && t3<70) System.out.println("ALL ARE UNFIT");
    }
}
