class Solution {
    public void reverseString(char[] arr) {
          int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move pointers towards the center
            left++;
            right--;
        }
    }
}