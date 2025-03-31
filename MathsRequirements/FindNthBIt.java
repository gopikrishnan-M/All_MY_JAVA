package MathsRequirements;

public class FindNthBIt {
    public static void main(String[] args) {
        int num=345;
        int n=8;//nth bit from the left side
        System.out.println(num&(1<<(n-1)));
        //for 7th bit it shows 64 which means there is one and at 8th bit it shows zero which means there is nothing
    }
}
