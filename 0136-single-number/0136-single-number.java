class Solution {
    public int singleNumber(int[] arr) {
        int n =arr.length;
        int num=0;
       for(int i=0;i<n;i++){
        num=num^arr[i];
       }
        return num;
    }
}