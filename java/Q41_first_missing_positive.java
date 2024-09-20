/*
Difficulty Level: HARD

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
*/

import java.util.Arrays;

public class Q41_first_missing_positive {
    public int firstMissingPositive(int[] nums) {
        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
        Arrays.sort(filteredNums);
        int target = 1;

        for (int n : filteredNums) {
            if (n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }
        
        return target;  
    }
}
