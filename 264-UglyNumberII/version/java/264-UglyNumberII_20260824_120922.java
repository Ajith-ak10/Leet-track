// Last updated: 8/24/2026, 12:09:22 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3        int []dp=new int [n];
4        dp[0]=1;
5        int i2=0;
6        int i3=0;
7        int i5=0;
8        for(int i=1;i<n;i++){
9            int a=dp[i2]*2;
10            int b=dp[i3]*3;
11            int c=dp[i5]*5;
12            dp[i]=Math.min(a,Math.min(b,c));
13            if(dp[i]==a){
14                i2++;
15            }
16            if(dp[i]==b){
17                i3++;
18            }
19            if(dp[i]==c){
20                i5++;
21            }
22        }
23        return dp[n-1];
24    }
25}