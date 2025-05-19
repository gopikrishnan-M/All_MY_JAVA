package Test_recursion;

public class StringLength {
    public static void main(String[] args) throws Exception {
        String s="fazlul";
        System.out.println(lengthFinder(s));
    }

    private static int lengthFinder(String s) throws Exception{
        int i=0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        }catch (StringIndexOutOfBoundsException e){
        }
        return i;
    }

//    private static int recLenFinder(String s){
//        return  hlp(s,0);
//    }
//
//    private static int hlp(String s, int i) throws Exception {
//        try {
//            s.charAt(i);
//            i++;
//        }catch (StringIndexOutOfBoundsException e){
//            return i;
//        }
//        return hlp(s,i);
//    }
}
