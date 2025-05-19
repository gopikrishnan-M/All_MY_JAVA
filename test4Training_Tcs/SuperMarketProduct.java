package test4Training_Tcs;

public class SuperMarketProduct {
    public static void main(String[] args) {
        int n=5424,ans=1;
        while (n>0){
            int last=n%10;
            ans*=last;
            n/=10;
        }
        System.out.println(ans);
    }
}
