// Last updated: 7/9/2026, 9:11:53 AM
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                l=mid+1;
            if(nums[mid]>target)
                r=mid-1;
        }return -1;
    }
}