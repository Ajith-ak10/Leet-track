// Last updated: 7/9/2026, 9:13:28 AM
class Solution {
    public int jump(int[] nums) {
        int goal=0;
        int end=0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>goal){
                goal=i+nums[i];
            }
            if(i==end){
                jump++;
                end=goal;
            }
        }
        return jump;
    }
}