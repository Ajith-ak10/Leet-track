// Last updated: 7/9/2026, 9:11:27 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int t=num;
        int r=0,dr=0;
        while(num!=0){
            int d=num%10;
            r=r*10+d;
            num/=10;
        }
        while(r!=0){
            int d=r%10;
            dr=dr*10+d;
            r/=10;
        }
        return(dr==t);
    }
}