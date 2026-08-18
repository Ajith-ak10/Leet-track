// Last updated: 8/18/2026, 3:01:43 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int st=s(nums,target,true);
4        if(st==-1)
5            return new int[]{-1,-1};
6        int e=s(nums,target,false);
7        
8        return new int []{st,e};
9    }
10    public int s(int []nums,int target,boolean st){
11        int l=0;
12        int r=nums.length-1;
13        int ans=-1;
14        while(l<=r){
15            int mid=l+(r-l)/2;
16            if(nums[mid]==target){
17                ans=mid;
18                if(st){
19                    r=mid-1;
20                }else{
21                    l=mid+1;
22                }
23            }
24            else if(nums[mid]<target){
25                l=mid+1;
26            }else{
27                r=mid-1;
28            }
29        }
30        return ans;
31    }
32}