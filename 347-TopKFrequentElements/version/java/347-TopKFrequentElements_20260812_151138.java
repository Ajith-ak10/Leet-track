// Last updated: 8/12/2026, 3:11:38 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer>map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
8        for(int num: map.keySet()){
9            pq.add (num);
10            if(pq.size()>k){
11                pq.poll();
12            }
13        }
14        int []ans=new int[k];
15        for(int i=k-1;i>=0;i--){
16            ans[i]=pq.poll();
17        }
18        return ans;
19    }
20}