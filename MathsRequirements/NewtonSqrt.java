package MathsRequirements;

public class NewtonSqrt {
    public static void main(String[] args) {
        int n=2;
        System.out.printf("%.2f",newtonRhalpson(n));;
    }

    private static double newtonRhalpson(int n) {
        double root;
        double x=n;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<1){//here there is 1 when this decreases then prcession increases
                break;
            }
            x=root;
        }
        return root;
    }
}
