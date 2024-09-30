/*
 * Difficulty Level: MEDIUM
 * 
 * A message is list of words that are separated by a single space with no leading or trailing spaces.
 * The word count of a sender is the total number of words sent by the sender. Note that a sender may send more than one message.
 * 
 * Return the sender with the largest word count. If there is more than one sender with the largest word count,
 *  return the one with the lexicographically largest name.
 * 
 * Note:
 * 
 * • Uppercase letters come before lowercase letters in lexicographical order.
 * • "Alice" and "alice" are distinct.
 * 
 */

import java.util.HashMap;

public class Q2284_sender_with_largest_word_count {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> word_count = new HashMap<String, Integer>();

        int max_count = 0;
        String name = "";

        for (int i = 0; i < messages.length; i++) {
            String[] words = messages[i].split("\\s+");
            int count = words.length;

            if (word_count.containsKey(senders[i])) {
                word_count.put(senders[i], word_count.get(senders[i]) + count);
            } else {
                word_count.put(senders[i], count);
            }

            if(word_count.get(senders[i]) > max_count){
                max_count = word_count.get(senders[i]);
                name = senders[i];
            }
            else if(word_count.get(senders[i]) == max_count && name.compareTo(senders[i]) < 0){
                name = senders[i];
            } 
        }

        return name;
    }
}
