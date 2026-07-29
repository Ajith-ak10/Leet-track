// Last updated: 7/29/2026, 2:59:11 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int min=nums[0];
4        int max=nums[0];
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]<min){
7                min=nums[i];
8            }
9            if(nums[i]>max){
10                max=nums[i];
11            }
12        }
13        return gcd(min,max);
14    }
15    private int gcd(int a,int b){
16        while(b!=0){
17            int temp=b;
18            b=a%b;
19            a=temp;
20        }
21        return a;
22    }
23}