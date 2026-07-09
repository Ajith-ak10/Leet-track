// Last updated: 7/9/2026, 9:11:52 AM
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        HashMap<String,Integer>map=new HashMap<>();
        for(int k=0;k<words.length;k++){
            if (map.containsKey(words[k])) {
                count += map.get(words[k]);
                continue;
            }
            int i=0,j=0;
            while(i<s.length()&&j<words[k].length()){
                if(s.charAt(i)==words[k].charAt(j)){
                    j++;
                }
                i++;
            }
            if(j==words[k].length()){
                map.put(words[k],1);
                count++;
            }else{
                map.put(words[k],0);
            }
        }
        return count;
    }
}