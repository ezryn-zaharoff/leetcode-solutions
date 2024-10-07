/*
 * Difficulty Level: HARD
 * 
 * You are given two positive integer arrays nums and numsDivide.
 * You can delete any number of elements from nums.
 * 
 * Return the minimum number of deletions such that the smallest element in nums divides all the elements of numsDivide.
 * If this is not possible, return -1.
 * 
 * Note that an integer x divides y if y % x == 0.
 * 
 */

import java.util.Arrays;

public class Q2344_minimum_deletions_to_make_array_divisible {
    public int gcd(int a, int b) {
       if (a == 0)return b;
       return gcd(b % a, a);
    }
    
    public int minOperations(int[] nums, int[] numsDivide) {
        int temp = numsDivide[0];

        for (int i = 1; i < numsDivide.length; i++) {
            temp = gcd(temp, numsDivide[i]);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (temp % nums[i] == 0) return i;
            if (nums[i] > temp) break;
        }
        
        return -1;
    }
}
