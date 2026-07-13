// Last updated: 7/13/2026, 11:17:54 AM
1class Solution {
2    public int mySqrt(int x) {
3        int l=1;
4        int r=x;
5        int num=0;
6        while(l<=r){
7            int mid=l+(r-l)/2;
8            long sq=(long) mid*mid;
9            if(sq==x){
10                return mid;
11            }else if(sq<x){
12                num=mid;
13                l=mid+1;
14            }else{
15                r=mid-1;
16            }
17        }
18        return num;
19    }
20}