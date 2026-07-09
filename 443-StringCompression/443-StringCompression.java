// Last updated: 7/9/2026, 9:12:13 AM
class Solution {
    public int compress(char[] chars) {
        int index=0;
        int count=1;
        for(int i=1;i<=chars.length;i++){
            if(i<chars.length&&chars[i]==chars[i-1]){
                count++;
            }
            else{
                chars[index++]=chars[i-1];
                String c=count+"";
                if(count>1){
                    for(int j=0;j<c.length();j++){
                        chars[index++]=c.charAt(j);
                    }
                }
                count=1;
            }
        }
        return index;
    }
}