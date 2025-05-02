package Stack;

import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(21);
        stk.push(32);
        stk.push(43);
        stk.push(54);
        stk.push(65);
        stk.push(76);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
