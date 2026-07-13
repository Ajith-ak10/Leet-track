// Last updated: 7/13/2026, 11:02:42 AM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n=nums.length;
4        int i=n-2;
5        while(i>=0&&nums[i]>=nums[i+1]){
6            i--;
7        }
8        if(i>=0){
9            int j=n-1;
10            while(nums[j]<=nums[i]){
11                j--;
12            }
13            int temp=nums[i];
14            nums[i]=nums[j];
15            nums[j]=temp;
16        }
17        int l=i+1;
18        int r=n-1;
19        while(l<r){
20            int temp=nums[l];
21            nums[l]=nums[r];
22            nums[r]=temp;
23            l++;
24            r--;
25        }
26    }
27}