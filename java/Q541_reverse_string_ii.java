public class Q541_reverse_string_ii {
    public String reverseStr(String s, int k) {
        String ans = "";
        int p = 0;

        for (int i = 0; i <= s.length()-1; i += k) {
            String sub = s.substring(i,Math.min(i+k,s.length()));
            String sub_reverse = "";

            if (p % 2 == 0) {
                for (int j = sub.length()-1; j >= 0; j--) {
                    sub_reverse += sub.charAt(j);
                }
                ans += sub_reverse;
            } else {
                ans += sub;
            }

            p++;
        }

        return ans;
    }
}