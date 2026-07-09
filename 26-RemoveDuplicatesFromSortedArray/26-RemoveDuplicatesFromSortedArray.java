// Last updated: 7/9/2026, 9:13:35 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=0;i<nums.length;i++){
                if(nums[i]!=nums[k-1]){
                    nums[k]=nums[i];
                    k++;
                }
        }
        return k;
    }
}