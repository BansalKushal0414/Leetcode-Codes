class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> hm = new HashMap<>();

        // for(int i = 0;i<nums.length;i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }

        // for(int num : hm.keySet()){
        //     if(hm.get(num) == 1){
        //         return num;
        //     }
        // }
        // return nums[0];

        int[] bits = new int[32];

        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<32;j++){
                if((nums[i] & (1 << j)) != 0){
                    bits[j]++;
                }
            }
        }

        for(int i= 0;i<32;i++){
            bits[i] = bits[i]%3;
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bits[i] == 1) {
                result |= (1 << i);
            }
        }
    return result;
    }
}