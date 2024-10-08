/*
 * Difficulty Level: HARD
 * 
 * You are given an array of strings ideas that represents a list of names to be used in the process of naming a company.
 * The process of naming a company is as follows:
 * 
 * 1. Choose 2 distinct names from ideas, call them ideaA and ideaB.
 * 2. Swap the first letters of ideaA and ideaB with each other.
 * 3. If both of the new names are not found in the original ideas,
 *    then the name ideaA ideaB (the concatenation of ideaA and ideaB,
 *    separated by a space) is a valid company name.
 * 4. Otherwise, it is not a valid name.
 * 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q2306_naming_a_company {
    public long distinctNames(String[] ideas) {
        HashMap<Character, HashSet<String>> mp = new HashMap<>();

        for (String idea : ideas) {
            char ch = idea.charAt(0);

            if (mp.containsKey(ch) == false) {
                mp.put(ch, new HashSet<>());
            }
            mp.get(ch).add(idea.substring(1));
        }

        long ans = 0;

        for (Map.Entry<Character, HashSet<String>> key1 : mp.entrySet()) {
            HashSet<String> sub1 = key1.getValue();
            for (Map.Entry<Character, HashSet<String>> key2 : mp.entrySet()) {
                if (key1 == key2) {
                    continue;
                }

                int dup = 0;
                HashSet<String> sub2 = key2.getValue();
                for (String str : sub2) {
                    if (sub1.contains(str)) {
                        dup++;
                    }
                }

                int valid1 = sub1.size() - dup;
                int valid2 = sub2.size() - dup;
                ans += (valid1 * valid2);
            }
        }

        return ans;
    }
}
