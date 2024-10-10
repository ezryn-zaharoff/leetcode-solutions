/*
 * Difficulty Level: MEDIUM
 * 
 * You are given a 0-indexed array of strings nums, where each string is of equal length and consists of only digits.
 * 
 * You are also given a 0-indexed 2D integer array queries where queries[i] = [ki, trimi].
 * For each queries[i], you need to:
 * 
 * • Trim each number in nums to its rightmost trimi digits.
 * • Determine the index of the kith smallest trimmed number in nums.
 *   If two trimmed numbers are equal, the number with the lower index is considered to be smaller.
 * • Reset each number in nums to its original length.
 * 
 * Return an array answer of the same length as queries, where answer[i] is the answer to the ith query.
 * 
 * Note:
 * 
 * • To trim to the rightmost x digits means to keep removing the leftmost digit, until only x digits remain.
 * • Strings in nums may contain leading zeros.
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q2343_query_kth_smallest_trimmed_number {
    class Node {
        int ind;
        String s;
        Node(String s, int i) {
            this.s = s;
            this.ind = i;
        }
    }

    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ArrayList<Node> sub = new ArrayList<>();

            for (int j = 0; j < nums.length; j++) {
                String s = nums[j].substring(nums[j].length() - queries[i][1]);
                sub.add(new Node(s, j));
            }

            Collections.sort(sub, new Comparator<Node>(){
                public int compare(Node a, Node b) {
                    return (a.s).compareTo(b.s);
                }
            });

            ans[i] = sub.get(queries[i][0] - 1).ind;
        }

        return ans;
    }
}
