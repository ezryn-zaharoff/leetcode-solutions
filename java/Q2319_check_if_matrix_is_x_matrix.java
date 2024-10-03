/*
 * Difficulty Level: EASY
 * 
 * A square matrix is said to be an X-Matrix if both of the following conditions hold:
 * 
 * 1. All the elements in the diagonals of the matrix are non-zero.
 * 2. All other elements are 0.
 * 
 * Given a 2D integer array grid of size n x n representing a square matrix, return true if grid is an X-Matrix.
 * Otherwise, return false.
 * 
 */

public class Q2319_check_if_matrix_is_x_matrix {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == c || r + c == n - 1) {
                    if (grid[r][c] == 0) {
                        return false;
                    }
                } else {
                    if (grid[r][c] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
