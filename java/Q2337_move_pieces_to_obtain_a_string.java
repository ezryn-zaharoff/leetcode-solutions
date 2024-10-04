/*
 * Difficulty Level: MEDIUM
 * 
 * You are given two strings start and target, both of length n.
 * Each string consists only of the characters 'L', 'R', and '_' where:
 * 
 * • The characters 'L' and 'R' represent pieces, where a piece 'L' can move to the left only if
 *   there is a blank space directly to its left, and a piece 'R' can move to the right only if
 *   there is a blank space directly to its right.
 * • The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.
 * 
 * Return true if it is possible to obtain the string target by moving the pieces of the string start any number of times.
 * Otherwise, return false.
 * 
 */

public class Q2337_move_pieces_to_obtain_a_string {
    public boolean canChange(String start, String target) {
        int r = 0;
        int l = 0;

        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'R') r++;
            if (target.charAt(i) == 'L') l--;
            if (r != 0 && l != 0) return false;
            if (target.charAt(i) == 'R') {
                r--;
                if (r < 0) return false;
            }
            if (start.charAt(i) == 'L') {
                l++;
                if (l > 0) return false;
            }
        }

        return r == 0 && l == 0;
    }
}
