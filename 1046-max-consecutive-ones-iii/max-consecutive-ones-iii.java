class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes = 0;
        int maxZeroes = 0;
        int pointer = 0;
        int leftZeroes = 0;

        while(pointer < nums.length){
            if(nums[pointer] == 0){
                zeroes++;
            }

            while(zeroes > k){
                if(nums[leftZeroes] == 0){
                    zeroes--;
                }
                leftZeroes++;
            }
            maxZeroes = Math.max(maxZeroes, pointer - leftZeroes + 1);
            pointer++;
        }
        return maxZeroes;
    }
}