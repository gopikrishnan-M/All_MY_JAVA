import oops_concepts.Library.Books;

import java.util.ArrayList;
import java.util.Arrays;
public class AllTry {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
}
    public static int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        for(int i=0 ; i< arr.length ; i++){
            char chk=arr[i];
            boolean isUniq=chkXcept(i,chk,arr);
            if (isUniq) {
                return i;
            }
        }
        return -1;
    }

    private static boolean chkXcept(int ignore, char chk, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i!=ignore&&chk==arr[i]){
                return false;
            }
        }
        return true;
    }
}
 /*[-7, 1, 5, 2, -4, 3, 0]
left_sum == total_sum - left_sum - arr[i].*/

//do recursive selection sort