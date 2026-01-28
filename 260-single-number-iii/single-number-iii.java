class Solution {
    public int[] singleNumber(int[] nums) {
        int totalXor = 0;
        int[] res = new int[2];
        int grp1 = 0;
        int grp2 = 0;
        for(int i=0;i<nums.length;i++){
            totalXor^=nums[i];
        }
        int mask = totalXor & (-totalXor);

        for(int num : nums){
            if((num & mask) != 0){
                grp1^=num;
            }
            else{
                grp2^=num;
            }
        }
        res[0] = grp1;
        res[1] = grp2;
        return res;
    }
}