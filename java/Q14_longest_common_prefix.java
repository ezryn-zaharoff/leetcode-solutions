/*
 * Difficulty Level: EASY
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 */

public class Q14_longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        int prefix_length = prefix.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];

            while (prefix_length > s.length() || !prefix.equals(s.substring(0, prefix_length))) {
                prefix_length--;
                if (prefix_length == 0) {
                    return "";
                }
                prefix = prefix.substring(0, prefix_length);
            }
        }

        return prefix;
    }
}
