class Solution {
    public long rob(int[] nums, int[] colors) {
        int n = nums.length;

        long[] dp = new long[n];
        dp[0] = nums[0];

        long prev = nums[0];
        long prev2 = 0;

        for(int i = 1; i < n; i++){
            long take;

            if(colors[i] == colors[i-1]){
                take = nums[i] + prev2;
            } else {
                take = nums[i] + prev;
            }

            long curr = Math.max(prev, take);

            dp[i] = curr;

            prev2 = prev;
            prev = curr;
        }
        return dp[n-1];
    }
}