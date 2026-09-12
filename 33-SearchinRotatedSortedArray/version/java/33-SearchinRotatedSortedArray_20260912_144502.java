// Last updated: 9/12/2026, 2:45:02 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        while(l<=r){
6            int mid=(l+r)/2;
7            if(nums[mid]==target){
8                return mid;
9            }
10            if(nums[l]<=nums[mid]){
11                if(nums[l]<=target&&target<nums[mid]){
12                    r=mid-1;
13                }else{
14                    l=mid+1;
15                }
16            }else{
17                if(nums[mid]<target&&target<=nums[r]){
18                    l=mid+1;
19                }else{
20                    r=mid-1;
21                }
22            }
23        }
24        return -1;
25    }
26}