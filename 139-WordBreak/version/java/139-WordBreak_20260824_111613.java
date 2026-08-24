// Last updated: 8/24/2026, 11:16:13 AM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        boolean[] dp=new boolean[s.length()+1];
4        dp[0]=true;
5        for(int i=0;i<=s.length();i++){
6            for(int j=0;j<i;j++){
7                if(dp[j]&&wordDict.contains(s.substring(j,i))){
8                    dp[i]=true;
9                    break;
10                }
11            }
12        }
13        return dp[s.length()];
14    }
15}