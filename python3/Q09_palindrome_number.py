#
# Difficulty Level: EASY
#
# Given an integer x, return true if x is a palindrome, and false otherwise.
#

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        number = x
        reverse = 0
        
        while number:
            reverse = reverse * 10 + number % 10
            number //= 10
        return x == reverse
    
    def isPalindrome2(self, x: int) -> bool:
        return False if x < 0 else str(x)[::-1] == str(x)