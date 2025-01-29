class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and split words by one or more spaces
        String[] words = s.trim().split("\\s+");  
        
        // Reverse the words in-place
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        // Join words with a single space
        return String.join(" ", words);
    }
}