// Last updated: 7/9/2026, 6:24:09 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max = nums[0];
4        int sum = 0;
5
6        for (int num : nums) {
7            sum += num;
8            max = Math.max(max, sum);
9            if (sum < 0) {
10                sum = 0;
11            }
12        }
13
14        return max;
15    }
16}