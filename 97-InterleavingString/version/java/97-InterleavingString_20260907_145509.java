// Last updated: 9/7/2026, 2:55:09 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m=s1.length();
4        int n=s2.length();
5        if(m+n!=s3.length()){
6            return false;
7        }
8        boolean [][]dp= new boolean [m+1][n+1];
9        dp[0][0]=true;
10        for(int i=0;i<=m;i++){
11            for(int j=0;j<=n;j++){
12                if(i>0 && s1.charAt(i-1)==s3.charAt(i+j-1)){
13                    dp[i][j]=dp[i][j]||dp[i-1][j];
14                }
15                if(j>0 && s2.charAt(j-1)==s3.charAt(i+j-1)){
16                    dp[i][j]=dp[i][j]||dp[i][j-1];
17                }
18            }
19        }
20        return dp[m][n];
21    }
22}