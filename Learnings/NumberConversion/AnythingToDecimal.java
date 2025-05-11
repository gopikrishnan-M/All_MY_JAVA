package Learnings.NumberConversion;

public class AnythingToDecimal {
    public static void main(String[] args) {
        int n=234;
        System.out.println("the value of number: "+ n);
        System.out.println("Decimal to Binary: "+decToAnything.decToBin(n));
        System.out.println("Decimal to octal: "+decToAnything.decToOct(n));
        System.out.println("Decimal to hexadecimal: "+decToAnything.decToHex(n));
        System.out.println("all those above values are passed to and converted into decimal");
        System.out.println(binToDec(decToAnything.decToBin(n)));
        System.out.println(octToDec(decToAnything.decToOct(n)));
        System.out.println(hexToDec(decToAnything.decToHex(n)));
    }
    public static int binToDec(String bin){
        int number=Integer.parseInt(bin,2);
        System.out.println(number+";)");
        int Decimal=0;
        for(int i=0;i<bin.length();i++){
            int b=bin.charAt(bin.length()-1-i)-'0';
            Decimal+=b*Math.pow(2,i);
        }
        return Decimal;
    }

    public static int octToDec(String oct){
        int number=Integer.parseInt(oct,8);
        System.out.println(number+";)");
        int Decimal=0;
        for(int i=0;i<oct.length();i++){
            int b=oct.charAt(oct.length()-1-i)-'0';
            Decimal+=b*Math.pow(8,i);
        }
        return Decimal;
    }

    public static int hexToDec(String hex){
        int number=Integer.parseInt(hex,16);
        System.out.println(number+";)");
        hex=hex.toUpperCase();
        int Decimal=0;
        for(int i=0;i<hex.length();i++){
            char ch=hex.charAt(hex.length()-1-i);
            int val=(ch>= '0' && ch<='9')?(ch-'0'):(10+ch-'A');
            Decimal+=val*Math.pow(16,i);
        }
        return Decimal;
    }

}
