class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        // Step 2: Find the index of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Step 3: The length of the last word is the distance between the last space
        // and the end of the string
        return s.length() - lastSpaceIndex - 1;
    }
}