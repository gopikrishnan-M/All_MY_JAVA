package test4Training;

public class IntelegenceAgency {
    public static void main(String[] args) {
        int n=99,r=3,sum=0;
        while (n>0){
            int last=n%10;
            sum+=last;
            n/=10;
        }
        n=2*sum;
        r=((int)Math.log10(n)+1);
        if(r==1) System.out.println(n);
        else {
            while (r!=1){
                sum=0;
                while (n>0){
                    int last=n%10;
                    sum+=last;
                    n/=10;
                }
                r=((int)Math.log10(sum)+1);
                n=sum;
            }
        }
        System.out.println(n);

    }
}
