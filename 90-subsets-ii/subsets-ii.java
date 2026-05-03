class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int length = nums.length;
        int total = 1<<length;
        LinkedHashSet<List<Integer>> set = new LinkedHashSet<>();

        for(int i = 0;i < total;i++){
            List<Integer> res = new ArrayList<>();
            for(int j=0;j < length;j++){
                if(((1<<j)&i) != 0) res.add(nums[j]);
            }
            Collections.sort(res);
            set.add(res);
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}