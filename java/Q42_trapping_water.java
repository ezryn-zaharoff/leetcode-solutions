/*
 * Difficulty Level : HARD
 * 
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 * 
 */

public class Q42_trapping_water {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int left_max = height[left];
        int right_max = height[right];
        int water = 0;

        while (left < right) {
            if (left_max < right_max) {
                left++;
                left_max = Math.max(left_max, height[left]);
                water += left_max - height[left];
            } else {
                right--;
                right_max = Math.max(right_max, height[right]);
                water += right_max - height[right];
            }
        }

        return water;
    }
}
