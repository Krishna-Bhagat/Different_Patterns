import java.util.Scanner;

public class n_queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of your board: ");
        int n= sc.nextInt();
        boolean[][] board = new boolean[n][n];
        int opt = queens(board,n);
        System.out.println("\nTotal number of ways in which you can place "+n+" queens in "+n+"X"+n+" board: "+opt+"\n");
        sc.close();
    }

    private static int queens(boolean[][] board, int row) {
        if(row == 0){
            printboard(board);
            return 1;
        }
        int count =0;
        for(int i=board.length; i>0; i--){
            if(issafe(board,row,i)){
                board[board.length-row][board.length-i] =true;
                count += queens(board,row-1);
                board[board.length-row][board.length-i] =false;
            }
        }
        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        for(int i=board.length; i>=row; i--){
            if(board[board.length-i][board.length-col]) return false;
        }
        for(int i=row, j = col; i<=board.length && j<=board.length; i++,j++){
            if(board[board.length -i][board.length-j]) return false;
        }
        for(int i=row, j = col; i<=board.length && j>0; i++,j--){
            if(board[board.length -i][board.length-j]) return false;
        }
        return true;
    }

    private static void printboard(boolean[][] board) {
        for(boolean[] arr: board){
            for(boolean tem: arr){
                if(tem == true) System.out.print(" Q  ");
                else System.out.print(" x  ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
