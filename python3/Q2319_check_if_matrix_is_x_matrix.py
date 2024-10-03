#
# Difficulty Level: EASY
#
# A square matrix is said to be an X-Matrix if both of the following conditions hold:
#
# 1. All the elements in the diagonals of the matrix are non-zero.
# 2. All other elements are 0.
#
# Given a 2D integer array grid of size n x n representing a square matrix, return true if grid is an X-Matrix.
# Otherwise, return false.
#

class Solution:
    def checkXMatrix(self, grid: List[List[int]]) -> bool:
        n = len(grid)

        for r in range(n):
            for c in range(n):
                if r == c or r + c == n - 1:
                    if grid[r][c] == 0:
                        return False
                else:
                    if grid[r][c] != 0:
                        return False

        return True