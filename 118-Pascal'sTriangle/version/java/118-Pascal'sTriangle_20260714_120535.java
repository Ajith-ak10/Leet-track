// Last updated: 7/14/2026, 12:05:35 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> res=new ArrayList<>();
4        for(int i=0;i< numRows;i++){
5            List<Integer> row= new ArrayList<>();
6            for(int j=0;j<=i;j++){
7                if(j==0||j==i){
8                    row.add(1);
9                }else{
10                    row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
11                }
12            }
13            res.add(row);
14        }
15        return res;
16    }
17}