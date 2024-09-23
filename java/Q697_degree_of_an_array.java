/*
 * Difficulty Level: EASY
 * 
 * Given a non-empty array of non-negative integers nums, the degree of this array is
 * defined as the maximum frequency of any one of its elements.
 * 
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 * that has the same degree as nums.
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class Q697_degree_of_an_array {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> num_count = new HashMap<>();
        int max_count = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (!num_count.containsKey(num)) {
                num_count.put(num, new int[]{i,i,1});
                if (max_count == 0) max_count = 1;
                if (ans == 0) ans = 1;
            } else {
                int []x = num_count.get(num);
                x[1] = i;
                x[2]++;

                if (x[2] > max_count) {
                    max_count = x[2];
                    ans = i - x[0] + 1;
                } else if (x[2] == max_count) {
                    ans = Math.min(ans, i - x[0] + 1);
                }
            }
        }

        return ans;
    }
}
