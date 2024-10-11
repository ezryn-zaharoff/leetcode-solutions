#
# Difficulty Level: HARD
#
# The score of an array is defined as the product of its sum and its length.
#
# • For example, the score of [1, 2, 3, 4, 5] is (1 + 2 + 3 + 4 + 5) * 5 = 75.
#
# Given a positive integer array nums and an integer k,
# return the number of non-empty subarrays of nums whose score is strictly less than k.
#
# A subarray is a contiguous sequence of elements within an array.
#

class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        total, left, count = 0, 0, 0

        for right, num in enumerate(nums):
            total += num

            while total * (right - left + 1) >= k:
                total -= nums[left]
                left += 1

            count += (right - left + 1)

        return count