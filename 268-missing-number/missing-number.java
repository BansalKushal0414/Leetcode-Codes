class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        int total = 0;
        for(int i = 0;i<nums.length;i++){
            missing^=nums[i];
            total = total^(i+1);
        }
        return missing^total;
    }
}