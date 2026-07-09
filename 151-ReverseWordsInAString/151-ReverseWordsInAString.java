// Last updated: 7/9/2026, 9:12:55 AM
class Solution {
    public String reverseWords(String s) {
        String b="";
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            if(!a[i].equals("")){
            b+=a[i]+" ";
        }
        }
        b=b.trim();
        return b;
    }
}