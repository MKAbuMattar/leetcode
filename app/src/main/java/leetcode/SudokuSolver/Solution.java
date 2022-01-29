package leetcode.SudokuSolver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public void solveSudoku(char[][] board) {
        List<Matrix> emptyCells = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    emptyCells.add(new Matrix(i, j));
                }
            }
        }
        solveSudoku(board, emptyCells, 0);
    }

    private boolean solveSudoku(char[][] board, List<Matrix> emptyCells, int curIdx) {
        if (curIdx == emptyCells.size()) {
            return true;
        }
        Matrix curMatrix = emptyCells.get(curIdx);

        Set<Integer> impossibleValues = getImpossibleValues(curMatrix.x, curMatrix.y, board);

        for (char i = '1'; i <= '9'; i++) {
            if (impossibleValues.contains(i - '0')) {
                continue;
            }

            board[curMatrix.x][curMatrix.y] = i;

            if (solveSudoku(board, emptyCells, curIdx + 1)) {
                return true;
            }

            impossibleValues.add(i - '0');
            board[curMatrix.x][curMatrix.y] = '.';
        }
        return false;
    }

    private Set<Integer> getImpossibleValues(int x, int y, char[][] board) {
        Set<Integer> impossibleValues = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][y] == '.') {
                continue;
            }
            impossibleValues.add(board[i][y] - '0');
        }
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == '.') {
                continue;
            }
            impossibleValues.add(board[x][i] - '0');
        }
        int si = getBoundary(x);
        int sj = getBoundary(y);
        for (int i = si; i <= si + 2; i++) {
            for (int j = sj; j <= sj + 2; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                impossibleValues.add(board[i][j] - '0');
            }
        }
        return impossibleValues;
    }

    private int getBoundary(int val) {
        if (val >= 0 && val <= 2) {
            return 0;
        }
        if (val >= 3 && val <= 5) {
            return 3;
        }
        return 6;
    }

    static class Matrix {
        int x;
        int y;

        public Matrix(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
