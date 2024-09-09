class Solution {
    public String reverseVowels(String s) {
         char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && !isVowel(charArray[left])) {
                left++;
            }
            
            // Move right pointer to the previous vowel
            while (left < right && !isVowel(charArray[right])) {
                right--;
            }
            
            // Swap vowels at left and right pointers
            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                
                // Move pointers inward
                left++;
                right--;
            }
        
        }
        return new String(charArray);
}

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}