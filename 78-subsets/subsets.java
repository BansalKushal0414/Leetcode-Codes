class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int length = nums.length;
        int total = 1<<length;

        for(int i = 0;i < total;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j < length;j++){
                if(((1<<j)&i) != 0) set.add(nums[j]);
            }
            List<Integer> res = new ArrayList<>(set);
            ans.add(res);
        }
        return ans;
    }
}