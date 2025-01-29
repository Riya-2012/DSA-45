public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];  // Array to store the frequency of each character
        int maxLen = 0;             // Maximum length of the valid substring
        int maxFreq = 0;            // Maximum frequency of any character in the current window
        int left = 0;               // Left pointer of the sliding window

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;  // Increment the frequency of the character at the 'right' pointer
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);  // Only update if needed
            
            // The window size is too big, shrink it from the left
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;  // Decrease the frequency of the character at 'left'
                left++;  // Move the left pointer
            }
            
            // Update the maximum length of the valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
