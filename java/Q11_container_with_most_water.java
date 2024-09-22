/*
 * Difficulty Level : MEDIUM
 * 
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * s
 */

public class Q11_container_with_most_water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = 0;

        while (left < right) {
            max_area = Math.max(max_area, (right - left) * Math.min(height[left], height[right]));
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max_area;
    }
}
