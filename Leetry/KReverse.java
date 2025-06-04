package Leetry;

class KReverse {
    public static void main(String[] args) {
        System.out.println(reverseStr("123451234512345123",5));
        String n="345";


    }
    public static String reverseStr(String s, int k) {
        StringBuilder ans=new StringBuilder();
        int l=s.length(),i=0;
//        if(l<=k) return ans.append(new StringBuilder(s).reverse()).toString();
        // this is unwanted
        while(i<l){
            int last=i+k<l?i+k:l;
            ans.append(new StringBuilder(s.substring(i,last)).reverse());
            //simply add string without reversing only if last+k does not cause outof bound
            if(last+k<l) ans.append(s.substring(last,last+k));
            //if above one fails then we have reached the end of string which is less than k then simply add it without reversing
            else if(last<l) ans.append(s.substring(last));
            //you might think if the string is shorter than k then it will be reversed and appended then here in elif
            //condition again it will be lesser which might append the upcoming string but there int last will store the
            //lenght itself so it will not be strictly shorter than tat of lenght ......even if you  use <= the substring()
            // that is going to be added will start from end but there will be no characters after end to append
            i+=2*k;
        } 
        return ans.toString();
    }
    // public String reverse(String str,int s, int e){
    //     StringBuilder sb=new StringBuilder();
    //    for(int i=e;i>=s;i--){
    //     sb.append(str.charAt(i));
    //    }
    //    return sb.toString();
    // }
}