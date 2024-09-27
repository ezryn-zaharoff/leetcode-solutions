#
# Difficulty Level: EASY
#
# The k-beauty of an integer num is defined as the number of substrings of num
# when it is read as a string that meet the following conditions:
#
# • It has a length of k.
# • It is a divisor of num.
#
# Given integers num and k, return the k-beauty of num.
#
# Note:
#
# • Leading zeros are allowed.
# • 0 is not a divisor of any value.
#
# A substring is a contiguous sequence of characters in a string.
#

class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        num_str = str(num)
        n = len(num_str)
        count = 0
    
        for i in range(n - k + 1):
            sub_str = num_str[i:i+k]
            sub_num = int(sub_str)
        
            if sub_num != 0 and num % sub_num == 0:
                count += 1
    
        return count