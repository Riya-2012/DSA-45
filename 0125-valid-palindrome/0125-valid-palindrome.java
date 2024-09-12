class Solution {
    public boolean isPalindrome(String s) {
        // Convert the input string to lowercase
        String s2 = s.toLowerCase();
        
        // Remove all non-alphanumeric characters
        StringBuilder cleanedStr = new StringBuilder();
        for (char c : s2.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedStr.append(c);
            }
        }
        
        // Convert cleaned string to a character array
        char[] chars = cleanedStr.toString().toCharArray();
        
        // Check for palindrome using two-pointer technique
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
