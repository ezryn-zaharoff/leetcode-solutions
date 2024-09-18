public class Q557_reverse_words_in_a_string_iii {
    public String reverseWords(String s) {
        String[] sub = s.split(" ");
        String ans = "";

        for (int i = 0; i <= sub.length-1; i++) {
            String sub_reverse = "";

            for (int j = sub[i].length()-1; j >= 0; j--) {
                sub_reverse += sub[i].charAt(j);
            }
            ans += sub_reverse;

            if (i == sub.length-1) {
                break;
            } else {
                ans += " ";
            }
        }

        return ans;
    }
}
