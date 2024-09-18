class Solution {
    public String longestPalindrome(String s) {
      if (s.length() <= 1) {
            return s;
        }
        
        String LPS = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > LPS.length()) {
                LPS = oddPalindrome;
            }

            // Even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > LPS.length()) {
                LPS = evenPalindrome;
            }
        }
        
        return LPS;
    }

    private String expandAroundCenter(String s, int low, int high) {
        // Expand around the center while characters match and pointers are in bounds
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
        }
        // Return the palindromic substring
        return s.substring(low + 1, high);
    }
    }