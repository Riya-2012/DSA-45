class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int maxLen=0;
        int maxF=0;
        int left=0;
        for(int r=0; r<s.length();r++){
            count[s.charAt(r)-'A']++;
            maxF=Math.max(maxF,count[s.charAt(r)-'A']);
            if((r-left+1)-maxF>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,r-left+1);
        }
return maxLen;
    }
}