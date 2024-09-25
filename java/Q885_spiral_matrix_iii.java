/*
 * Difficulty Level: MEDIUM
 * 
 * You start at the cell (rStart, cStart) of an rows x cols grid facing east.
 * The northwest corner is at the first row and column in the grid,
 * and the southeast corner is at the last row and column.
 * 
 * You will walk in a clockwise spiral shape to visit every position in this grid.
 * Whenever you move outside the grid's boundary, we continue our walk outside
 * the grid (but may return to the grid boundary later.).
 * Eventually, we reach all rows * cols spaces of the grid.
 * 
 * Return an array of coordinates representing the positions of the grid in the order you visited them.
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Q885_spiral_matrix_iii {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<int[]> ans = new ArrayList<>();
        ans.add(new int[]{rStart, cStart});
        int count = (rows * cols) - 1;

        int row = rStart, col = cStart;
        int steps = 1;

        while (count > 0) {
            int[][] movements = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            
            for (int m = 0; m < 4; m++) {
                for (int i = 0; i < steps; i++) {
                    row += movements[m][0];
                    col += movements[m][1];

                    if (row >= 0 && row < rows && col >= 0 && col < cols) {
                        ans.add(new int[]{row, col});
                        count--;
                    }
                }

                if ((movements[m][0] == 1 && movements[m][1] == 0) || (movements[m][0] == -1 && movements[m][1] == 0)) {
                    steps++;
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
