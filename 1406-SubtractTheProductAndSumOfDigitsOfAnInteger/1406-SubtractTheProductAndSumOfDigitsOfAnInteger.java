// Last updated: 7/9/2026, 9:11:42 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int rev=0;
        int p=1,sum=0;
        while(n>0){
            int digit=n%10;
            p*=digit;
            sum+=digit;
            n/=10;
        }
        return (p-sum);
    }
}