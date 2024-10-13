class Solution {
    public boolean isPalindrome(int x) {
        // If the number is negative or ends with 0 but is not 0, it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        
        // Reverse half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;  // Add the last digit to reversedHalf
            x /= 10;  // Remove the last digit from x
        }
        
        // If the number is a palindrome, the first half (x) and the reversed half should be the same
        // If the number has odd digits, reversedHalf / 10 removes the middle digit
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
