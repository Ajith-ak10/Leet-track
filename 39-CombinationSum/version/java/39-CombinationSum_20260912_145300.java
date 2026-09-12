// Last updated: 9/12/2026, 2:53:00 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>>ans= new ArrayList<>();
4        solve(candidates,target,0,new ArrayList<>(),ans);
5        return ans;
6    }
7    void solve(int []a, int target, int st, List<Integer>list, List<List<Integer>> ans){
8        if(target==0){
9            ans.add(new ArrayList<>(list));
10            return;
11        }
12        if(target<0){
13            return;
14        }
15        for(int i=st;i<a.length;i++){
16            list.add(a[i]);
17            solve(a,target-a[i],i,list,ans);
18            list.remove(list.size()-1);
19        }
20    }
21}