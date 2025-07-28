package RangeQuerry;

public class RangeQuerryBasic {
    public static void main(String[] args) {
        /*
        SQUARE ROOT DECOMPOSITION one of the importan algo be used for anything which has time complexity of root(n)
        * when a array is given and a querry is given like find the largest,smallest,sum of ,etc
        * in the given range
        * STEPS :-
        *       first split the array into chunks of size sqroot(n)
        *       now perform preprocessing
        *       when a range is given it surely will exist in any of the following
        *               -completely in a chunk or multiple complete chunks
        *               -left contain some and some complete chunk and vice versa
        *               -left contain some and right contain some middle may or may not contain some
        *       number of blocks will be root n
        *       to find in which block i th element lies i=i%root(n)
        * */
        int[] arr={1,3,5,2,7,6,3,1,4,8};
        int n=arr.length;
        int sqrt=(int) Math.sqrt(n);
        int blocks_id=-1;
        int[] blocks=new int[sqrt+1];
        //making blocks as we need i.e depending on the querry
        for(int i=0;i<n;i++){
            //new block is starting
            if (i % sqrt == 0) {
                blocks_id++;
            }
            blocks[blocks_id]+=arr[i];
        }
    }
    public static int query(int[] blocks ,int[] arr,int l,int r, int sqrt){
        int ans=0;

        //left part
        while (l % sqrt != 0 && l < r) {
            ans += arr[l];
            l++;
        }

        //middle part
        while (l + sqrt <= r) {
            ans +=blocks[l/sqrt];
            l +=sqrt;
        }

        //right part
        while (l <= r) {
            ans+=arr[l];
            l++;
        }

        return ans;
    }
    public void update(int[] blocks,int[] arr,int i,int val,int sqrt){
        int block_id=i/sqrt;
        blocks[block_id]+=(val-arr[i]);
        arr[i]=val;
    }
}
