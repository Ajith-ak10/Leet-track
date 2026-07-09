// Last updated: 7/9/2026, 9:12:04 AM
class Solution {
    public String reverseWords(String s) {
        String ans="";
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            String rev="";
            for(int j=words[i].length()-1;j>=0;j--){
                rev+=words[i].charAt(j);
            }
            ans+=rev;
            if(i!=words.length-1){
                ans+=" ";
            }
        }

        return ans;
    }
}