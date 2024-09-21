/*
 * Difficulty Level: EASY
 * 
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 */

public class Q09_palindrome_number {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int number = x;
        int reverse = 0;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }

        return number == reverse;
    }
}
