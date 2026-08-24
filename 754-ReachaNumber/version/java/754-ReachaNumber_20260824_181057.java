// Last updated: 8/24/2026, 6:10:57 PM
1class Solution {
2    public int reachNumber(int target) {
3        target=Math.abs(target);
4        int sum=0;
5        int moves=0;
6        while(sum<target||(sum-target)%2!=0){
7            moves++;
8            sum+=moves;
9        }
10        return moves;
11    }
12}