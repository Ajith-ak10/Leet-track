// Last updated: 9/1/2026, 3:54:46 PM
1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3        List<List<Integer>> res=new ArrayList<>();
4        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(nums1[a[0]]+nums2[a[1]])-(nums1[b[0]]+nums2[b[1]]));
5        for(int i=0;i<nums1.length&&i<k;i++){
6            pq.offer(new int[]{i,0});
7        }
8        while(k>0&& !pq.isEmpty()){
9            int []p=pq.poll();
10            int i=p[0];
11            int j=p[1];
12            res.add(Arrays.asList(nums1[i],nums2[j]));
13            if(j+1<nums2.length){
14                pq.offer(new int[]{i,j+1});
15            }
16            k--;
17        }
18        return res;
19    }
20}