package arrays.question8;

import java.util.ArrayList;

class Solution {
    private boolean checkColumn(char[][] board, int colNumber){
        ArrayList<Character> x = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            if (board[i][colNumber] != '.') {
                if (x.contains(board[i][colNumber])) {
                    return false;
                }
                x.add(board[i][colNumber]);
            }
        }
        return true;
    }
    private boolean checkAllColumns(char[][] board){
        return checkColumn(board, 0) && checkColumn(board, 1) && checkColumn(board, 2) && checkColumn(board, 3) && checkColumn(board, 4) && checkColumn(board, 5) && checkColumn(board, 6) && checkColumn(board, 7) && checkColumn(board, 8);
    }

    private boolean checkRow(char[][] board, int rowNumber){
        ArrayList<Character> x = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            if (board[rowNumber][i] != '.') {
                if (x.contains(board[rowNumber][i])) {
                    return false;
                }
                x.add(board[rowNumber][i]);
            }
        }
        return true;
    }
    private boolean checkAllRows(char[][] board){
        return checkRow(board, 0) && checkRow(board, 1) && checkRow(board, 2) && checkRow(board, 3) && checkRow(board, 4) && checkRow(board, 5) && checkRow(board, 6) && checkRow(board, 7) && checkRow(board, 8);
    }

    private boolean checkBox(char[][] board, int x, int y){
        int xPoints = x == 0 ? 0 : x == 1 ? 3 : 6;
        int yPoints = y == 0 ? 0 : x == 1 ? 3 : 6; 
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i+xPoints][j+yPoints] != '.') {
                    if (arr.contains(board[i+xPoints][j+yPoints])) {
                        return false;
                    }else{
                        arr.add(board[i+xPoints][j+yPoints]);
                    }
                }
            }
        }
        return true;
    }
    private boolean checkAllBoxes(char[][] board){
        return checkBox(board, 0, 0) && checkBox(board, 0, 1) && checkBox(board, 0, 2) && checkBox(board, 1, 0) && checkBox(board, 1, 1) && checkBox(board, 1, 2) && checkBox(board, 2, 0) && checkBox(board, 2, 1) && checkBox(board, 2, 2);
    }

    public boolean isValidSudoku(char[][] board) {
        return checkAllRows(board) && checkAllBoxes(board) && checkAllColumns(board);
    }
}


public class ValidSudoku {
    public static void main(String[] args) {
        Solution x = new Solution();
        char[][] sudoku = {
            {'1','2','.','.','3','.','.','.','.'},
            {'4','.','.','5','.','.','.','.','.'},
            {'.','9','8','.','.','.','.','.','3'},
            {'5','.','.','.','6','.','.','.','4'},
            {'.','.','.','8','.','3','.','.','5'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','.','.','.','.','.','2','.','.'},
            {'.','.','.','4','1','9','.','.','8'},
            {'.','.','.','.','8','.','.','7','9'},
        };
        System.out.println(x.isValidSudoku(sudoku));
    }
}

