package test4Training_Tcs;
import java.util.ArrayList;

public class Sunday {
    public static void main(String[] args) {
        ArrayList<String> week=new ArrayList<>();
        week.add("mon");
        week.add("tue");
        week.add("wed");
        week.add("thur");
        week.add("fri");
        week.add("sat");
        week.add("sun");
        int days=20;
        String start="tue";
        days=days+ week.indexOf(start);
        System.out.println(days/7);
    }
}
