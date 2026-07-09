// Last updated: 7/9/2026, 9:12:26 AM
class Solution {
    public void reverseString(char[] s) {
        int l=0;int r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
}