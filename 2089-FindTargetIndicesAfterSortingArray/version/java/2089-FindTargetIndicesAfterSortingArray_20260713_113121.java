// Last updated: 7/13/2026, 11:31:21 AM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int []temp=arr.clone();
4        Arrays.sort(temp);
5        HashMap<Integer,Integer> map=new HashMap<>();
6        int rank=1;
7        for(int i=0;i<temp.length;i++){
8            if(!map.containsKey(temp[i])){
9                map.put(temp[i],rank);
10                rank++;
11            }
12        }
13        for(int i=0;i<arr.length;i++){
14            arr[i]=map.get(arr[i]);
15        }
16        return arr;
17    }
18}