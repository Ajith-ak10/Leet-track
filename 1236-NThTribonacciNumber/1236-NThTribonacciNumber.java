// Last updated: 7/9/2026, 9:11:43 AM
class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int x = 0; 
        int y = 1;  
        int z = 1;  
        int t = 0;  

        for (int i = 3; i <= n; i++) {
            t = x + y + z;
            x = y;
            y = z;
            z = t;
        }
        return t;
    }
}