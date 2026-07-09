// Last updated: 7/9/2026, 9:12:40 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int milen=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                milen=Math.min(milen,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return milen==Integer.MAX_VALUE?0:milen;
    }
}