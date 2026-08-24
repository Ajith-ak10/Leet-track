// Last updated: 8/24/2026, 11:32:54 AM
1class Solution {
2    public int maximumGap(int[] nums) {
3        Arrays.sort(nums);
4        int max=0;
5        for(int i=1;i<nums.length;i++){
6            int diff=nums[i]-nums[i-1];
7            if(diff>max){
8                max=diff;
9            }
10        }
11        return max;
12    }
13}