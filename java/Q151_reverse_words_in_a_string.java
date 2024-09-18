public class Q151_reverse_words_in_a_string {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String ans = "";

        for (int i = words.length-1; i >= 0; i--) {
            ans += words[i];

            if (i == 0) {
                break;
            } else {
                ans += " ";
            }
        }

        return ans;
    }
}
