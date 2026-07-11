class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        if(n == 1) return 0;
        int jumps = 0;
        int farItCanGo = 0;
        int currentEnd = 0;

        for(int  i = 0; i<n;i++){
            farItCanGo = Math.max(farItCanGo , i + nums[i]);

            if(i == currentEnd){
                jumps++;
                currentEnd = farItCanGo;

                if(currentEnd >= n-1){
                    break;
                }
            }
        }
        return jumps;
    }
}