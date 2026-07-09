// Last updated: 7/9/2026, 9:13:45 AM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        int temp=x;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x/=10;
        }
        return (temp==rev);
    }
}