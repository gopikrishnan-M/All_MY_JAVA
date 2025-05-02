package Test2;

public class SortFreq {
    public static void main(String[] args) {
        int[] arr={4,4,6,7,4,6,5};
        int[] count=new int[9];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int max=-1;
        while(max!=0){
            max=findMax(count);
            for (int i = 0; i < count[max]; i++) {
                System.out.print(max+",");
            }
            count[max]=0;
        }
    }

    private static int findMax(int[] count) {
        int pos=-1;
        int max=0;
        for (int i = 0; i < count.length; i++) {
            if(max<=count[i]){
                max=count[i];
                pos=i;
            }
        }
        return pos;
    }
}
