#
# Difficulty Level: MEDIUM
#
# A message is list of words that are separated by a single space with no leading or trailing spaces.
# The word count of a sender is the total number of words sent by the sender. Note that a sender may send more than one message.
#
# Return the sender with the largest word count. If there is more than one sender with the largest word count,
# return the one with the lexicographically largest name.
#
# Note:
#
# • Uppercase letters come before lowercase letters in lexicographical order.
# • "Alice" and "alice" are distinct.
#

class Solution:
    def largestWordCount(self, messages: List[str], senders: List[str]) -> str:
        word_count = {}

        for message, sender in zip(messages, senders):
            count = len(message.split())

            if sender in word_count:
                word_count[sender] += count
            else:
                word_count[sender] = count
        
        max_count = max(word_count.values())
        max_senders = [sender for sender, count in word_count.items() if count == max_count]

        return max(max_senders)