class Solution:
    def reverseWords(self, s: List[str]) -> None:
        sub = ""
        words = []
        ans = []

        for i, ch in enumerate(s):
            if ch == " ":
                words.append(sub)
                sub = ""
            elif i == len(s) - 1:
                sub += ch
                words.append(sub)
            else:
                sub += ch

        words.reverse()

        for i, word in enumerate(words):
            for j, ch in enumerate(word):
                ans.append(ch)
            if i < len(words) - 1:
                ans.append(" ")

        return ans