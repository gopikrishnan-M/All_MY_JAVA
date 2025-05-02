package Test3;

public class Frequency {
    public static void main(String[] args) {
        int h=0,e=0,l=0,o=0;
        String s="hello";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='h') h++;
            if(s.charAt(i)=='e') e++;
            if(s.charAt(i)=='l') l++;
            if(s.charAt(i)=='o') o++;
        }
        System.out.println("h:"+ h + "   e:"+ e + "   l:"+ l + "  o:"+ o );
    }
}
