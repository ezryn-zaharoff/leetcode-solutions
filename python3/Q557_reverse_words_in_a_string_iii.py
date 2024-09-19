class Solution:
    def reverseWords(self, s: str) -> str:
        sub = s.split()
        ans = ""

        for i, word in enumerate(sub):
            ans += word[::-1]
            if i == len(sub) - 1:
                return ans
            ans += " "