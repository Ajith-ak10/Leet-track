// Last updated: 7/9/2026, 9:13:48 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int m=nums1.length;
      int n=nums2.length; 
      int merge[]=new int [m+n];
      for(int i=0;i<m;i++)
        merge[i]=nums1[i];
      for(int i=0;i<n;i++)
        merge[m+i]=nums2[i];
      Arrays.sort (merge);
      int len = merge.length;
      if (len % 2 == 0) {
           
            return (merge[len / 2 - 1] + merge[len / 2]) / 2.0;
        } else {
            return merge[len / 2];
        }
      
    }
}