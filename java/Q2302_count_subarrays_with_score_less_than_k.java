/*
 * Difficulty Level: HARD
 * 
 * The score of an array is defined as the product of its sum and its length.
 * 
 * • For example, the score of [1, 2, 3, 4, 5] is (1 + 2 + 3 + 4 + 5) * 5 = 75.
 * 
 * Given a positive integer array nums and an integer k,
 * return the number of non-empty subarrays of nums whose score is strictly less than k.
 * 
 * A subarray is a contiguous sequence of elements within an array.
 * 
 */

public class Q2302_count_subarrays_with_score_less_than_k {
    public long countSubarrays(int[] nums, long k) {
        long total = 0, count = 0;

        for (int i = 0, left = 0; i < nums.length; i++) {
            total += nums[i];

            while (total * (i - left + 1) >= k) {
                total -= nums[left];
                left++;
            }

            count += (i - left + 1);
        }

        return count;
    }
}
