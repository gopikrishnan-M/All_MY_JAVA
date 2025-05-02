package Test;

public class Nonrepeat {
    public static void main(String[] args) {
        String s="swizz";
        char[] arr=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            boolean repeat =false;
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    repeat =true;
                    break;
                }
            }
            if(!repeat){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
