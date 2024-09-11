public class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();
        
        // Iterate over all starting points of substrings
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // Frequency array for 26 lowercase letters
            
            int maxFreq = 0;
            
            // Iterate over all possible substrings starting from i
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++; // Increment the frequency of the current character
                
                // Update max frequency dynamically
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'a']);
                
                // Find minimum frequency among non-zero frequencies
                int minFreq = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }
                
                // Add the beauty of the current substring to the total
                totalBeauty += (maxFreq - minFreq);
            }
        }
        
        return totalBeauty;
    }
}
