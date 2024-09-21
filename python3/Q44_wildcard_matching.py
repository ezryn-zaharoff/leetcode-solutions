#
# Difficulty Level : HARD
#
# Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
#
# • '?' Matches any single character.
# • '*' Matches any sequence of characters (including the empty sequence).
#
# The matching should cover the entire input string (not partial).
#

def isMatch(self, s: str, p: str) -> bool:
        i, j = 0, 0
        m, n = len(s), len(p)
        star_index, match_index = -1, -1

        while i < m:
            if j < n and (p[j] == s[i] or p[j] == '?'):
                j += 1
                i += 1
            elif j < n and p[j] == '*':
                star_index = j
                match_index = i
                j += 1
            elif star_index != -1:
                j = star_index + 1
                match_index += 1
                i = match_index
            else:
                return False

        while j < n and p[j] == '*':
            j += 1

        return j == n