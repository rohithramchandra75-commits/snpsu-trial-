package Module9;
import java.util.*;

public class NQueens {

    static boolean isSafe(char[][] board,int row,int col,int n){

        for(int i=0;i<row;i++)
            if(board[i][col]=='Q') return false;

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
            if(board[i][j]=='Q') return false;

        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++)
            if(board[i][j]=='Q') return false;

        return true;
    }

    static void solve(int row,char[][] board,List<List<String>> res,int n){

        if(row==n){

            List<String> temp=new ArrayList<>();

            for(char[] r:board)
                temp.add(new String(r));

            res.add(temp);
            return;
        }

        for(int col=0;col<n;col++){

            if(isSafe(board,row,col,n)){

                board[row][col]='Q';

                solve(row+1,board,res,n);

                board[row][col]='.';
            }
        }
    }

    public static void main(String[] args){

        int n=4;

        char[][] board=new char[n][n];

        for(char[] row:board)
            Arrays.fill(row,'.');

        List<List<String>> res=new ArrayList<>();

        solve(0,board,res,n);

        System.out.println(res);
    }
}