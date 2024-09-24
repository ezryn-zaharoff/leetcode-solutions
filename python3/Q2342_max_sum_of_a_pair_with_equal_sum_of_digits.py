#
# Difficulty Level : MEDIUM
#
# You are given a 0-indexed array nums consisting of positive integers.
# You can choose two indices i and j, such that i != j, and the sum of
# digits of the number nums[i] is equal to that of nums[j].
#
# Return the maximum value of nums[i] + nums[j] that you can obtain over
# all possible indices i and j that satisfy the conditions.
#

class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        hashmap = defaultdict(list)

        for n in nums:
            digit_sum = 0
            num = n

            while num:
                digit_sum += num % 10
                num //= 10
                
            hashmap[digit_sum].append(n)

        ans = -1

        for v in hashmap.values():
            if len(v) > 1:
                v = sorted(v,reverse=True)
                ans = max(ans, v[0] + v[1])

        return ans