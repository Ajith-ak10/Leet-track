// Last updated: 7/9/2026, 9:12:39 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}