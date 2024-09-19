class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals, key=lambda x:x[0])
        ans = []

        for nums in intervals:
            sub = nums
            
            if ans:
                if ans[-1][1] >= nums[0]: 
                    sub = ans.pop()
                    if nums[1] > sub[1]:
                        sub[1] = nums[1]

            ans.append(sub)

        return ans