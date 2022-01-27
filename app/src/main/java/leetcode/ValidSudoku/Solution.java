package leetcode.ValidSudoku;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        return isValidSudoku(board, 0, 0);
    }

    private boolean isValidSudoku(char[][] board, int i, int j) {
        if (i == board.length) {
            return true;
        }

        int row;
        int col;

        if (board[0].length - 1 == j) {
            row = i + 1;
            col = 0;
        } else {
            row = i;
            col = j + 1;
        }

        if (board[i][j] != '.') {
            for (int idx = 0; idx < board.length; idx++) {
                if (board[i][j] == board[idx][j] && idx != i) {
                    return false;
                }

                if (board[i][j] == board[i][idx] && idx != j) {
                    return false;
                }
            }

            int specificRow = i / 3 * 3;
            int specificCol = j / 3 * 3;

            for (int matrixI = 0; matrixI < 3; matrixI++) {
                for (int matrixJ = 0; matrixJ < 3; matrixJ++) {
                    if (matrixI + specificRow != i && matrixJ + specificCol != j && board[i][j] == board[matrixI + specificRow][matrixJ + specificCol]) {
                        return false;
                    }
                }
            }
        }
        return isValidSudoku(board, row, col);
    }

}
