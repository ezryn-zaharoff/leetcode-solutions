#
# Difficulty Level: HARD
#
# You are given an array of strings ideas that represents a list of names to be used in the process of naming a company.
# The process of naming a company is as follows:
#
# 1. Choose 2 distinct names from ideas, call them ideaA and ideaB.
# 2. Swap the first letters of ideaA and ideaB with each other.
# 3. If both of the new names are not found in the original ideas,
#    then the name ideaA ideaB (the concatenation of ideaA and ideaB,
#    separated by a space) is a valid company name.
# 4. Otherwise, it is not a valid name.
#
# Return the number of distinct valid names for the company.
#

class Solution:
    def distinctNames(self, ideas: List[str]) -> int:
        mp = defaultdict(set)

        for word in ideas:
            mp[word[0]].add(word[1:])

        keys = list(mp.keys())
        n, ans = len(keys), 0

        for i in range(n):
            for j in range(i+1, n):
                key1, key2 = keys[i], keys[j]
                sub1, sub2 = mp[key1], mp[key2]
                dup = len(sub1 & sub2)
                ans += (len(sub1) - dup) * (len(sub2) - dup) * 2

        return ans