// Last updated: 7/9/2026, 9:11:41 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zc=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zc++;
            }
            while(zc>1){
                if(nums[left]==0){
                    zc--;
                }
                left++;
            }
            max=Math.max(max,r-left);
        }
        return max;
    }
}