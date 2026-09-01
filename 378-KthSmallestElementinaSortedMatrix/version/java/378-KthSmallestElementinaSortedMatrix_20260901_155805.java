// Last updated: 9/1/2026, 3:58:05 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        PriorityQueue<Integer>pq=new PriorityQueue<>();
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix.length;j++){
6                pq.offer(matrix[i][j]);
7            }
8        }
9        for(int i=1;i<k;i++){
10            pq.poll();
11        }
12        return pq.poll();
13    }
14}