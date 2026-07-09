// Last updated: 7/9/2026, 9:12:51 AM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int m=nums.length/2;
        return nums[m];
    }
}