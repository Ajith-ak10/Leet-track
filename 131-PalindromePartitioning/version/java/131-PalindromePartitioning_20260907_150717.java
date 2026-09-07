// Last updated: 9/7/2026, 3:07:17 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> ans= new ArrayList<>();
4        backtrack(s,0,new ArrayList<>(),ans);
5        return ans;
6    }
7    void backtrack(String s,int st, List<String> list, List<List<String>> ans){
8        if(st==s.length()){
9            ans.add(new ArrayList<>(list));
10            return;
11        }
12        for(int i=st;i<s.length();i++){
13            if(isPalindrome(s,st,i)){
14                list.add(s.substring(st,i+1));
15                backtrack(s,i+1,list,ans);
16                list.remove(list.size()-1);
17            }
18        }
19    }
20    boolean isPalindrome(String s,int l,int r){
21        while(l<r){
22            if(s.charAt(l)!=s.charAt(r)){
23                return false;
24            }
25            l++;
26            r--;
27        }
28        return true;
29    }
30}