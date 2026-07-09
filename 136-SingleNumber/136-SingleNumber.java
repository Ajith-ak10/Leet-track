// Last updated: 7/9/2026, 9:12:57 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums)
        ans^=i;
        return ans;
    }
}