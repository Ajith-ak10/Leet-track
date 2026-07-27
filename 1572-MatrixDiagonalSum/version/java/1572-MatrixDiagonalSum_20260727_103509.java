// Last updated: 7/27/2026, 10:35:09 AM
1class Solution {
2    public int diagonalPrime(int[][] nums) {
3        int n=nums.length;
4        int max=0;
5        for(int i=0;i<n;i++){
6            int a=nums[i][i];
7            if(a>=2){
8                int j;
9                for(j=2;j*j<=a;j++){
10                    if(a%j==0){
11                        break;
12                    }
13                }
14                if(j*j>a){
15                    max=Math.max(max,a);
16                }
17            }
18            int b=nums[i][n-1-i];
19            if(b>=2){
20                int j;
21                for(j=2;j*j<=b;j++){
22                    if(b%j==0){
23                        break;
24                    }
25                }
26                if(j*j>b){
27                    max=Math.max(max,b);
28                }
29            }
30        }
31        return max;
32    }
33}