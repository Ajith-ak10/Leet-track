// Last updated: 7/9/2026, 9:12:48 AM
class Solution {
    public int rob(int[] nums) {
        int p1 = 0;  
        int p2 = 0; 
        
        for (int i : nums) {
            int temp = p1;  
            p1 = Math.max(p1, p2 + i);  
            p2 = temp;  
        }
        
        return p1;  
    }
}