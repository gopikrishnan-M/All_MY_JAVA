package Leetry;

public class RotateEqualorNot {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(findRotation(mat,mat));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        //transpose of matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //then reverse it by row to rotate it
        for(int i=0;i<n;i++){
            int last = n-1;
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][last];
                mat[i][last--]=temp;
            }
        }

        //check for equality and then return ture of false
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i]!=target[i]) return false;
            }
        }
        return true;


    }

}
