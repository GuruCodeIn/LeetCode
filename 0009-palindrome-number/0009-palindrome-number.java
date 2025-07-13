class Solution {
    public boolean isPalindrome(int x) {
         int mod, sigh = 1, dig = 0, n = x;
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        while (n != 0) {

                mod = n % 10;
            if (dig > (Integer.MAX_VALUE - mod) / 10) {
                return false; // Overflow means not a valid palindrome
            }
                dig = dig * 10 + mod;
                n = n / 10;
            }
            return (dig==x);
    }
}