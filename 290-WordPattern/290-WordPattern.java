// Last updated: 7/9/2026, 9:12:30 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Object,Integer>map=new HashMap<>();
        for(Integer i=0;i<pattern.length();i++){
            if(map.put(pattern.charAt(i),i)!=map.put(words[i],i)){
                return false;
            }
        }
        return true;
    }
}