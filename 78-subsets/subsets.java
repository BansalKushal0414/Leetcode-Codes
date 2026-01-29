class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int length = nums.length;
        int total = 1<<length;

        for(int i = 0;i < total;i++){
            List<Integer> res = new ArrayList<>();
            for(int j=0;j < length;j++){
                if(((1<<j)&i) != 0) res.add(nums[j]);
            }
            ans.add(res);
        }
        return ans;
    }
}