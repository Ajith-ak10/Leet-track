// Last updated: 8/5/2026, 3:07:41 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int u[][]=new int[m][n];
4        for(int j=0;j<n;j++){
5            u[0][j]=1;
6        }
7        for(int i=0;i<m;i++){
8            u[i][0]=1;
9        }
10        for(int i=1;i<m;i++){
11            for(int j=1;j<n;j++){
12                u[i][j]=u[i-1][j]+u[i][j-1];
13            }
14        }
15        return u[m-1][n-1];
16    }
17}