// Last updated: 8/11/2026, 3:02:02 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,-1);
5        int s=0;
6        int m=0;
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==0){
9                s--;
10            }else{
11                s++;
12            }
13            if(map.containsKey(s)){
14               m=Math.max(m,i-map.get(s));
15            }
16            else{
17                map.put(s,i);
18            }
19        }
20        return m;
21    }
22}