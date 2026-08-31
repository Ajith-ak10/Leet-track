// Last updated: 8/31/2026, 2:50:38 PM
1class Solution {
2    public int findMaxForm(String[] strs, int m, int n) {
3        int [][]dp=new int[m+1][n+1];
4        for(String s:strs){
5            int z=0;
6            int o=0;
7            for(char c:s.toCharArray()){
8                if(c=='0'){
9                    z++;
10                }else{
11                    o++;
12                }
13            }
14            for(int i=m;i>=z;i--){
15                for(int j=n;j>=o;j--){
16                    dp[i][j]=Math.max(dp[i][j],dp[i-z][j-o]+1);
17                }
18            }
19        }
20        return dp[m][n];
21    }
22} 