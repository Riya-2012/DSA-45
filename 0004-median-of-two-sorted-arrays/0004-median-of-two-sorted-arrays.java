class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int i=0,j=0,k=0;
       int n1=nums1.length;
       int n2=nums2.length;
       int[] m=new int[n1+n2];
       while(i<n1 && j<n2) {
        if(nums1[i]<=nums2[j]){
m[k++]=nums1[i++];
        }else{
            m[k++]=nums2[j++];
        }
       }
       while(i<n1){
        m[k++]=nums1[i++];
       }
       while(j<n2){
        m[k++]=nums2[j++];
       }
       if(k%2!=0){
        return m[k/2];
       }
       else{
        return (m[(k-1)/2]+m[k/2])/2.0;
       }
    }
}