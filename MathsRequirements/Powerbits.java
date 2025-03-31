package MathsRequirements;

public class Powerbits {
    public static void main(String[] args) {
        int a=3;
        int powe =3;
        int ans=1;
        int base=a;
        while(powe >0){
            int last= powe &1;
            if(last==1){
                ans*=base;
            }
            base*=base;
            powe = powe >>1;
        }
        System.out.println(ans);
    }
}
