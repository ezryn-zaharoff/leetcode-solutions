/*
 * Difficulty Level: EASY
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 */

public class Q58_length_of_last_word {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length-1].length();
    }
}
