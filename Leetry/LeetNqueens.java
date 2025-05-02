package Leetry;

import java.util.ArrayList;
import java.util.List;

public class LeetNqueens {
    public static void main(String[] args) {
        for(List<String> one:solveNQueens(4)){
            System.out.println(one);
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return queens(board,0);
    }

    public static List<List<String>> queens(boolean[][] board,int row){
        List<List<String>> ans=new ArrayList<>();
        if (row == board.length ) {
            ans.add(displayChess(board));
            return ans;
        }
        for(int col=0;col<board.length;col++){
            if(isCorrect(board,row,col)){
                board[row][col]=true;
                ans.addAll(queens(board,row+1));
                board[row][col]=false;
            }
        }
        return ans;
    }

    private static boolean isCorrect(boolean[][] board, int row, int col) {
        //checks the entire row for queen's presence
        for (int i=0;i<board.length;i++){
            if(board[i][col])
                return false;

        }
        //checks top left diagonal
        int leftMax=Math.min(row,col);//these avoids outOfBound exceptions

        for (int i=1;i<=leftMax;i++){
            if(board[row-i][col-i])
                return false;

        }
        //chaecks rop right diagonal
        int rigthMax=Math.min(row,board.length-col-1);//these avoids outOfBound exceptions

        for(int i=1;i<=rigthMax;i++){
            if (board[row-i][col+i])
                return false;

        }

        return true;
    }

    private static List<String> displayChess(boolean[][] board) {
        List<String> one=new ArrayList<>();
        for (boolean[] arr:board){
            StringBuilder s=new StringBuilder();
            for (boolean element: arr){
                if (element) s.append('Q');
                else s.append('.');
            }
            one.add(s.toString());
        }
        return one;
    }

}
