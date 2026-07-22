// Last updated: 7/22/2026, 2:36:51 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans= new ArrayList<>();
4        int n=nums.length;
5        int total=1<<n;
6        for(int i=0;i<total;i++){
7            List<Integer> list= new ArrayList<>();
8            for(int j=0;j<n;j++){
9                if((i&(1 << j))!=0){
10                    list.add(nums[j]);
11                }
12            }
13            ans.add(list);
14        }
15        return ans;
16    }
17}