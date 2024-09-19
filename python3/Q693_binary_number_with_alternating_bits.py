class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        num = list(bin(n))[2:]

        for i in range(1, len(num)):
            if num[i-1] == num[i]:
                return False
                break

        return True