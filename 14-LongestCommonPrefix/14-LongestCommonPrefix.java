// Last updated: 7/9/2026, 9:13:38 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null|| strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        int ind=0;
        while(ind<f.length()&&ind<l.length())
        {
            if(f.charAt(ind)==l.charAt(ind)){
                ind++;
            }else {
                break;
            }
        }
        return f.substring(0,ind);
    }
}