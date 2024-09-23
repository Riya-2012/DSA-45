class Solution {
    public String minWindow(String s, String t) {
       if (s.length() == 0 || t.length() == 0) return "";

        // ASCII character array for t and window (128 covers all ASCII characters)
        int[] tFreq = new int[128];
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        // Two pointers for the sliding window
        int left = 0, right = 0;
        int required = t.length();  // Total characters required (not unique)
        int formed = 0;  // How many characters are satisfied in the window

        // Array for the current window
        int[] windowCounts = new int[128];

        // Variables to keep track of the smallest window
        int[] ans = {-1, 0, 0};  // Length, left, right of the best window

        while (right < s.length()) {
            // Add the current character to the window
            char c = s.charAt(right);
            windowCounts[c]++;

            // If the character is in t and the count in the window matches the required count
            if (tFreq[c] > 0 && windowCounts[c] <= tFreq[c]) {
                formed++;
            }

            // Try to contract the window from the left while it is valid
            while (formed == required) {
                // Check if this is the smallest valid window
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                // Shrink the window from the left
                char leftChar = s.charAt(left);
                windowCounts[leftChar]--;

                if (tFreq[leftChar] > 0 && windowCounts[leftChar] < tFreq[leftChar]) {
                    formed--;
                }

                left++;
            }

            // Expand the window by moving the right pointer
            right++;
        }

        // Return the smallest window, or empty string if no valid window is found
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
 
    }
}