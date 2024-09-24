/*
 * Difficulty Level : MEDIUM
 * 
 * You are given a 0-indexed array nums consisting of positive integers.
 * You can choose two indices i and j, such that i != j, and the sum of
 * digits of the number nums[i] is equal to that of nums[j].
 * 
 * Return the maximum value of nums[i] + nums[j] that you can obtain over
 * all possible indices i and j that satisfy the conditions.
 * 
 */

import java.util.HashMap;

public class Q2342_max_sum_of_a_pair_with_equal_sum_of_digits {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int ans = -1;

        for (int num : nums) {
            int digit_sum = calculateSum(num);

            if (hashmap.containsKey(digit_sum)) {
                int prev = hashmap.get(digit_sum);
                ans = Math.max(ans, prev + num);
                hashmap.put(digit_sum, Math.max(prev, num));
            } else {
                hashmap.put(digit_sum, num);
            }
        }

        return ans;
    }

    public int calculateSum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
