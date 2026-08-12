// Last updated: 8/12/2026, 3:55:19 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6        }
7        Integer[]a=set.toArray(new Integer[0]);
8        Arrays.sort(a,Collections.reverseOrder());
9        if(a.length>=3){
10            return a[2];
11        }
12        return a[0];
13    }
14}