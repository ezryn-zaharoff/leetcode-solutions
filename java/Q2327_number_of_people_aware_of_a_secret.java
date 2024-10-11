/*
 * Difficulty Level: MEDIUM
 * 
 * On day 1, one person discovers a secret.
 * 
 * You are given an integer delay, which means that each person will share the secret with a new person every day,
 * starting from delay days after discovering the secret.
 * You are also given an integer forget, which means that each person will forget the secret forget days after discovering it.
 * A person cannot share the secret on the same day they forgot it, or on any day afterwards.
 * 
 * Given an integer n, return the number of people who know the secret at the end of day n.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 * 
 */

public class Q2327_number_of_people_aware_of_a_secret {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long mod = (long)1e9 + 7;
        long share = 0;
        
        long dp[] = new long[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i - delay > 0) {
                share += dp[i - delay];
            }

            if (i - forget > 0) {
                share -= dp[i - forget];
            }

            dp[i] = share % mod;
        }

        long ans = 0;

        for (int i = n - forget + 1; i <= n; i++) {
            ans += dp[i];
        }

        return (int) (ans % mod);
    }
}
