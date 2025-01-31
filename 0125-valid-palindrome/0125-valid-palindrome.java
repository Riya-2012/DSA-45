class Solution {
    public boolean isPalindrome(String s) {
       
        String s2 = s.toLowerCase();
        
        StringBuilder cleanedStr = new StringBuilder();
        for (char c : s2.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedStr.append(c);
            }
        }
        
      
        char[] chars = cleanedStr.toString().toCharArray();
        
      
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
