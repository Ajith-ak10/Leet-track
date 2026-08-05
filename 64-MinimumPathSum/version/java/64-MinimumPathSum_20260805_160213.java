// Last updated: 8/5/2026, 4:02:13 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m=obstacleGrid.length;
4        int n=obstacleGrid[0].length;
5        int a[][]=new int[m][n];
6        if(obstacleGrid[0][0]==1)
7            return 0;
8        a[0][0]=1;
9        for(int j=1;j<n;j++){
10            if(obstacleGrid[0][j]==0){
11               a[0][j]=a[0][j-1]; 
12            }
13        }
14        for(int i=1;i<m;i++){
15            if(obstacleGrid[i][0]==0){
16               a[i][0]=a[i-1][0]; 
17            }
18        }
19        for(int i=1;i<m;i++){
20            for(int j=1;j<n;j++){
21                if(obstacleGrid[i][j]==1){
22                    a[i][j]=0;
23                }
24                else{
25                    a[i][j]=a[i-1][j]+a[i][j-1];
26                }
27            }
28        }
29        return a[m-1][n-1];
30    }
31}