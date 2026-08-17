// Last updated: 8/17/2026, 2:57:25 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length;
4        int ans=n;
5        for(int i=0;i<n;i++){
6            ans=ans^i^nums[i];
7        }
8        return ans;
9    }
10}