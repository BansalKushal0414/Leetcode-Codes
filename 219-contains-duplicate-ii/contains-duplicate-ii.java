class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 1;

        while(i<nums.length){
            if(j < nums.length && nums[i] == nums[j] && Math.abs(i-j) <= k){
                return true;
            }

            if(Math.abs(i-j) > k || j >= nums.length){
                i++;
                j = i+ 1;
            }
            else{
                j++;
            }
        }
        return false;
    }
}