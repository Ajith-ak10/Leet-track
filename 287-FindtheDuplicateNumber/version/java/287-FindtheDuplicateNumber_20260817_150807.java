// Last updated: 8/17/2026, 3:08:07 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            if(set.contains(nums[i])){
6                return nums[i];
7            }
8            set.add(nums[i]);
9        }
10        return -1;
11    }
12}