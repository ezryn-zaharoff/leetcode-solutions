class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        ans = ""
        p = 0

        for i in range(0,len(s),k):
            sub = ""
            sub = s[i:i+k]
            if p % 2 == 0:
                sub = sub[::-1]
            ans += sub
            p += 1

        return ans