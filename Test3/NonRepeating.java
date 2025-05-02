package Test3;

public class NonRepeating {
    public static void main(String[] args) {
        String s="hello";
        boolean chk=true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)) {
                    s=s.replace(s.charAt(i),'_');
                }
            }

        }
        System.out.println(s);
    }
}
