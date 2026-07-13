// Last updated: 7/13/2026, 11:59:15 AM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            map.put(ch,map.getOrDefault(ch,0)+1);
7        }
8        List<Character>list=new ArrayList<>(map.keySet());
9        Collections.sort(list,(a,b)-> map.get(b)-map.get(a));
10        StringBuilder a=new StringBuilder();
11        for(char ch:list){
12            for(int i=0;i<map.get(ch);i++){
13                a.append(ch);
14            }
15        }
16        return a.toString();
17    }
18}