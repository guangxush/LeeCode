package cn.shgx.medium;

import java.util.LinkedList;

/**
Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
A region is captured by flipping all 'O's into 'X's in that surrounded region.
Example:
X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:
X X X X
X X X X
X X X X
X O X X
Explanation:
Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. 
Two cells are connected if they are adjacent cells connected horizontally or vertically.
 */
public class SurroundedRegions {
    public void solve(char[][] board) {
    	if(board == null || board.length == 0 || board[0].length == 0)
            return;
        for(int i = 0; i < board[0].length; i ++) {
            fill(board, 0, i);
            fill(board, board.length - 1, i);
        }
        for(int i = 0; i < board.length; i ++) {
            fill(board, i, 0);
            fill(board, i, board[0].length - 1);
        }
        for(int i = 0; i < board.length; i ++) {
            for(int j = 0; j < board[0].length; j ++) {
                if(board[i][j] == '#')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        } 
    }
    void fill(char[][] board, int i, int j) {
        if(board[i][j] != 'O')
            return;
        board[i][j] = '#';
        LinkedList<Integer> queue = new LinkedList<>();
        int index = i * board[0].length + j;
        queue.offer(index);
        while(!queue.isEmpty()) {
            index = queue.poll();
            int row = index / board[0].length;
            int col = index % board[0].length;
            if(row - 1 >= 0 && board[row - 1][col] == 'O') {
                board[row - 1][col] = '#';
                queue.offer((row - 1) * board[0].length + col);
            }
            if(row + 1 < board.length && board[row + 1][col] == 'O') {
                board[row + 1][col] = '#';
                queue.offer((row + 1) * board[0].length + col);
            }
            if(col - 1 >= 0 && board[row][col - 1] == 'O') {
                board[row][col - 1] = '#';
                queue.offer(row * board[0].length + (col - 1));
            }
            if(col + 1 < board[0].length && board[row][col + 1] == 'O') {
                board[row][col + 1] = '#';
                queue.offer(row * board[0].length + (col + 1));
            }
        }
    }
}
