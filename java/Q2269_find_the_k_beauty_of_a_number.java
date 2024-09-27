/*
 * Difficulty Level: EASY
 * 
 * The k-beauty of an integer num is defined as the number of substrings of num
 * when it is read as a string that meet the following conditions:
 * 
 * • It has a length of k.
 * • It is a divisor of num.
 * 
 * Given integers num and k, return the k-beauty of num.
 * 
 * Note:
 * 
 * • Leading zeros are allowed.
 * • 0 is not a divisor of any value.
 * 
 * A substring is a contiguous sequence of characters in a string.
 * 
 */

public class Q2269_find_the_k_beauty_of_a_number {
    public int divisorSubstrings(int num, int k) {
        String num_str = Integer.toString(num);
        int n = num_str.length();
        int count = 0;

        for (int i = 0; i < n - k + 1; i++) {
            String sub_str = num_str.substring(i, i + k);
            int sub_num = Integer.valueOf(sub_str);

            if (sub_num != 0 && num % sub_num == 0) {
                count++;
            }
        }

        return count;
    }
}
