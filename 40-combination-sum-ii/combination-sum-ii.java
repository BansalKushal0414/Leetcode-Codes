class Solution {
    List<List<Integer>> ans;
    int n;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        n = candidates.length;
        Arrays.sort(candidates);
        fn(candidates , target , new ArrayList<>() , 0);
        return ans;
    }

    void fn(int[] arr , int target , List<Integer> num , int idx){
        if(target == 0){
            ans.add(new ArrayList<>(num));
            return;
        }

        if(idx == n) return;

        for(int i = idx ; i < n ; i++){
            if(arr[i] > target) break;
            if(i > idx && arr[i] == arr[i-1]) continue;
            num.add(arr[i]);
            fn(arr , target - arr[i] , num , i + 1);
            num.remove(num.size() - 1);
        }
    }
}