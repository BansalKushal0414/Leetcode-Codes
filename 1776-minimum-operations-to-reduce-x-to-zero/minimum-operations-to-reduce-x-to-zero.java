class Solution {
    public int minOperations(int[] nums, int x) {
        int ans = -1;
        int totalSum = 0;
        int left = 0;
        int total = 0;

        for(int i = 0; i<nums.length;i++){
            totalSum+=nums[i];
        }

        totalSum-=x;

        for(int i = 0;i<nums.length;i++){
            total+=nums[i];
            while(left <= i && total > totalSum){
                
                    total-=nums[left];
                    left++;
                
            }
            if(total == totalSum){
                ans =  Math.max(ans,i-left+1);
            }
        }
        return ans==-1?ans:nums.length-ans;
    }
}