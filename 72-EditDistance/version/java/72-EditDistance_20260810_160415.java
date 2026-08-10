// Last updated: 8/10/2026, 4:04:15 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m=word1.length();
4        int n=word2.length();
5        int a[][]=new int [m+1][n+1];
6        for(int i=0;i<=m;i++){
7            a[i][0]= i;
8        }
9        for(int j=0;j<=n;j++){
10            a[0][j]=j;
11        }
12        for(int i=1;i<=m;i++){
13            for(int j=1;j<=n;j++){
14                if(word1.charAt(i-1)==word2.charAt(j-1)){
15                    a[i][j]=a[i-1][j-1];
16                }else{
17                    a[i][j]=1+ Math.min( a[i-1][j],
18                    Math.min(a[i][j-1],a[i-1][j-1]) );
19                }
20            }
21        }
22        return a[m][n];
23    }
24}