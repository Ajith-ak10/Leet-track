// Last updated: 8/11/2026, 2:14:11 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        List <Integer> a=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(set.contains(nums[i])){
7                a.add(nums[i]);
8            }else{
9                set.add(nums[i]);
10            }
11        }
12        return a;
13    }
14}