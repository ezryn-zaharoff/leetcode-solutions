# Difficulty Level: HARD

# Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
#
# You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
#

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums = [n for n in nums if n > 0]
        nums.sort()
        target = 1
        
        for n in nums:
            if n == target:
                target += 1
            elif n > target:
                return target
        
        return target
