// Last updated: 8/11/2026, 1:49:35 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set=new HashSet<>();
4        HashSet<Integer> r=new HashSet<>();
5        for(int i=0;i<nums1.length;i++){
6            set.add(nums1[i]);
7        }
8        for(int i=0;i<nums2.length;i++){
9            if(set.contains(nums2[i])){
10                r.add(nums2[i]);
11            }
12        }
13        int a[]=new int[r.size()];
14        int i=0;
15        for(int x:r){
16            a[i]=x;
17            i++;
18        }
19        return a;
20    }
21}