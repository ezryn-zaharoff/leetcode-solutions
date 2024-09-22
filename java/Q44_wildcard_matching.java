/*
 * Difficulty Level : HARD
 * 
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
 * 
 * • '?' Matches any single character.
 * • '*' Matches any sequence of characters (including the empty sequence).
 * 
 * The matching should cover the entire input string (not partial).
 * 
 */

public class Q44_wildcard_matching {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int m = s.length();
        int n = p.length();
        int star_index = -1;
        int match_index = -1;

        while (i < m) {
            if (j < n && ((p.charAt(j) == s.charAt(i)) || (p.charAt(j) == '?'))) {
                j++;
                i++;
            } else if (j < n && (p.charAt(j) == '*')) {
                star_index = j;
                match_index = i;
                j++;
            } else if (star_index != -1) {
                j = star_index + 1;
                match_index++;
                i = match_index;
            } else {
                return false;
            }
        }

        while (j < n && p.charAt(j) == '*') {
            j++;
        }

        return j == n;
    }
}
