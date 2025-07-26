package BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        BigInteger a=BigInteger.valueOf(12312);//here we only should give values of integer not more that it
        BigInteger b=BigInteger.valueOf(23);
       // System.out.println(a.add(b));//we cannot directly add those coz they are objects not values

        //to use some very long numbers we use string format
        BigInteger d=new BigInteger("12234554354314355653767756465787653464556");
        BigInteger e=new BigInteger("23453467656876856234563457565543654564576");
       // System.out.println(d.multiply(e));

        //to compare the objects
//        if (e.compareTo(d) > 0) {
//            System.out.println("e is greater");
//        }
        bigDecimal();

    }
        public static void bigDecimal(){
            double a=0.04;
            double b=0.05;
            System.out.println(b-a);
            //0.010000000000000002 this is the answer for tat but the actual answer should be 0.01
            //they are floating point numbers which are represented internally as fractions that is why
            //when do calculations they dont give exact answers (with error of 10^-19)whereas integers are
            // fixed numbers so they give exact answers
            BigDecimal X = new BigDecimal( "0.03" ) ;
            BigDecimal Y = new BigDecimal( "0.04" ) ;
            BigDecimal ans = Y. subtract(X);// this will give the exact answer

        }

}
