package RabinKarp;

public class StringMatchingAlgo {
    private final int prime=101;

    private long calculateHash(String str){
        long hash=0;
        for(int i=0;i<str.length();i++){
            hash= (long) (hash+str.charAt(i)*Math.pow(prime,i));
        }
        return hash;
    }

    private long updateHash(long prevHash,char old,char next,int patternLength){
        long newHash=(prevHash-old)/prime;
        newHash=(long) (newHash+next*Math.pow(prime,patternLength-1));
        return newHash;
    }

    public void searchPattern    (String text, String pattern){
        int l=pattern.length();
        long patternHash=calculateHash(pattern);
        long textHash=calculateHash(text.substring(0,l));

        for(int i=0;i<text.length()-l;i++){
            if (textHash == patternHash) {
                if(text.substring(i,i+l).equals(pattern)){
                    System.out.println("pattern found at index " +i);
                }
            }

            if (i < text.length() - l) {
                textHash=updateHash(textHash,text.charAt(i),text.charAt(i+l),l);
            }
        }
    }
}
