class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
          if (n == 0 || n == 1)
            return n;
      
        
        int j = 0;
      for (int i = 0; i < n; i++)
            if (arr[j] != arr[i]){
                arr[++j] = arr[i];
            }
      
    
      
        return j+1;
    }
}