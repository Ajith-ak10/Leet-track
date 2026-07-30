// Last updated: 7/30/2026, 2:43:59 PM
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        HashMap<String,Integer>map=new HashMap<>();
4        String a[]=s1.split(" ");
5        String b[]=s2.split(" ");
6        for(int i=0;i<a.length;i++){
7            map.put(a[i],map.getOrDefault(a[i],0)+1);
8        }
9        for(int i=0;i<b.length;i++){
10            map.put(b[i],map.getOrDefault(b[i],0)+1);
11        }
12        ArrayList<String>list=new ArrayList<>();
13        for(String key:map.keySet()){
14            if(map.get(key)==1){
15                list.add(key);
16            }
17        }
18        return list.toArray(new String[0]);
19    }
20}