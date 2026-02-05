class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int k = 1;
        int j = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]==nums[i] && k==1){
                k++;
                count++;
                j++;
                nums[j] = nums[i];
            }
            else if(nums[j]!=nums[i]){
                j++;
                k=1;
                count++;
                nums[j] = nums[i];
            }
        }
        return count++;
    }
}