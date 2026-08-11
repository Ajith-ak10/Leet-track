// Last updated: 8/11/2026, 2:31:35 PM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,1);
5        for(int i=0;i<nums.length;i++){
6            HashMap<Integer,Integer> next=new HashMap<>();
7            for(int sum:map.keySet()){
8                int a=sum+nums[i];
9                int s=sum-nums[i];
10                next.put(a,next.getOrDefault(a,0)+map.get(sum));
11                next.put(s,next.getOrDefault(s,0)+map.get(sum));
12
13            }
14            map=next;
15        }
16        return map.getOrDefault(target,0);
17    }
18}