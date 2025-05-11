package Learnings;

class ForAlfa {
    public static void main(String[] args) {
        /*for(char i='A';i<='Z';i++){
            int ascii=i;
            System.out.println(ascii);
        }*/
       int[] arr=alfaCounter("gopi!@##$%%^^&&*()_+=     -;:''");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) {
                System.out.println(((char) (i + 65)) + " : " + arr[i]);
            }
        }


    }
    private static int[] alfaCounter(String s){
        int[] freq=new int[26];
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) {
                freq[s.charAt(i) - 65]++;
            }
        }
        return freq;
    }

}
