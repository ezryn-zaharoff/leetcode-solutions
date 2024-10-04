#
# Difficulty Level: MEDIUM
#
# You are given two strings start and target, both of length n.
# Each string consists only of the characters 'L', 'R', and '_' where:
#
# • The characters 'L' and 'R' represent pieces, where a piece 'L' can move to the left only if
#   there is a blank space directly to its left, and a piece 'R' can move to the right only if
#   there is a blank space directly to its right.
# • The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.
#
# Return true if it is possible to obtain the string target by moving the pieces of the string start any number of times.
# Otherwise, return false.
#

class Solution:
    def canChange(self, start: str, target: str) -> bool:
        r, l = 0, 0

        for a, b in zip(start, target):
            if a == "R":
                r += 1
            if b == "L":
                l -= 1
            if r != 0 and l != 0:
                return False
            if b == "R":
                r -= 1
                if r < 0:
                    return False
            if a == "L":
                l += 1
                if l > 0:
                    return False

        return r == l == 0