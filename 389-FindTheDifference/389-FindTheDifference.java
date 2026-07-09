// Last updated: 7/9/2026, 9:12:21 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        char ans=' ';
        for(int i=0;i<b.length;i++){
            int c1=0,c2=0;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    c1++;
                }
            }
            for(int j=0;j<b.length;j++){
                if(b[i]==b[j]){
                    c2++;
                }
            }

            if(c2>c1){
                ans=b[i];
                break;
            }
        }
        return ans;
    }
}