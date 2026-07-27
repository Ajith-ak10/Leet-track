// Last updated: 7/27/2026, 11:15:54 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n=nums.length;
4        int a[]=new int [n];
5        for(int i=0;i<n;i++){
6            a[i]=nums[i]*nums[i];
7        }
8        Arrays.sort(a);
9        return a;
10    }
11}