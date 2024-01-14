package backtracking;

public class WordSearch {

    public boolean exist(char[][] board, String word) {

        int row=board.length;

        int col=board[0].length;

        for (int i = 0; i <row ; i++) {

            for (int j = 0; j < col; j++) {

                if(board[i][j] == word.charAt(0)){
                    if(dfs(board,i,j,word,0))
                        return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int row, int col, String word, int k) {


        if(row<0 || row>=board.length || col<0 || col>=board[0].length) return false;

        if(k>=word.length()) return true;

        board[row][col]-=65;

        if(row >0 && word.charAt(k+1) == board[row-1][col] && dfs(board,row-1,col,word,k+1))
            return true;

        if(row < board.length-1 && word.charAt(k+1) == board[row+1][col] && dfs(board,row+1,col,word,k+1))
            return true;
        if(col > 0 && word.charAt(k+1) == board[row][col-1] && dfs(board,row,col-1,word,k+1))
            return true;
        if(col < board[0].length-1 && word.charAt(k+1) == board[row][col+1] && dfs(board,row,col+1,word,k+1))
            return true;
        board[row][col]+=65;

        return false;
    }

    public static void main(String[] args) {


    }
}
