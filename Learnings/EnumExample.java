package Learnings;

public class EnumExample {
    enum Week {
        //these are enum constants,public ,static, final ,as it is final you can create child enums
        // data type is week
        //no abstracts are allowed
        //method body is required
        //can compare using== ,can implement as many interface required
        Monday, tuesday, wednesday, thursday, friday, saturday, sunday;

        Week() {
            System.out.println("constructor called for " + this);
        }
    }

    public static void main(String[] args) {
        Week Day;
        Day = Week.Monday;
//        System.out.println(Day);
//        for(Week day:Week.values()){
//            System.out.println(day);
//        }
        System.out.println(Day.ordinal());
        ;//similar to acessing the index

    }
}
