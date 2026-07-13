// Last updated: 7/13/2026, 10:18:45 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n=nums.length;
4        for(int i=0;i<n;i++){
5            while(nums[i]>0&&nums[i]<=n&&nums[nums[i]-1]!=nums[i]){
6                int temp=nums[i];
7                nums[i]=nums[temp-1];
8                nums[temp-1]=temp;
9            }
10        }
11        for(int i=0;i<n;i++){
12            if(nums[i]!=i+1)
13                return i+1;
14        }
15        return n+1;
16    }
17}