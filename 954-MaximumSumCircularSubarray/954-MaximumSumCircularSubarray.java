// Last updated: 7/9/2026, 9:11:47 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=nums[0];
        int cmax=nums[0];
        int maxs=nums[0];
        int cmin=nums[0];
        int mins=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cmax+nums[i]>nums[i]){
                cmax=cmax+nums[i];
            }else{
                cmax=nums[i];
            }
            if(cmax>maxs){
                maxs=cmax;
            }
            if(cmin+nums[i]<nums[i]){
                cmin=cmin+nums[i];
            }
            else{
                cmin=nums[i];
            }
            if(cmin<mins){
                mins=cmin;
            }
            total+=nums[i];
        }
        if(maxs<0){
            return maxs;
        }
        if(maxs>total-mins){
            return maxs;
        }else{
            return total-mins;
        }
    }
}