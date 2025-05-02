package Leetry;

public class SubString {
    public static void main(String[] args) {
        String haystack="hibrohowareyou";
        String needle="are";

        StringBuilder sb=new StringBuilder(haystack);

        System.out.println(haystack.indexOf(needle));
    }
}
