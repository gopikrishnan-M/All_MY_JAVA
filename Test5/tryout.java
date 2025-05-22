package Test5;

public class tryout {
    public static void main(String[] args) {
        char[] arr=new char[2];
        if(arr[0]=='\u0000') System.out.println(" it is filled with empty");
    }

        public String convert(String s, int n) {
            char[][] arr=new char[n][1+s.length()/2];
            filler(s,arr,0,n,0,0);
            StringBuilder sb=new StringBuilder();
            for(char[] ar:arr){
                for(char c:ar) if(c!='\u0000') sb.append(c);
            }
            return sb.toString();
        }
        public void filler(String s,char[][] arr,int rs,int re,int cs,int trac){
            if(trac>=s.length()) return ;
            while(rs<re&& trac<s.length()) arr[rs][cs]=s.charAt(trac++);
            rs--;
            cs++;
            while(rs>=0 && trac<s.length())  arr[rs--][cs++]=s.charAt(trac++);
            rs++;
            cs--;
            filler(s,arr,rs,re,cs,trac);
        }

}
