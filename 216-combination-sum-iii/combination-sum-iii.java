class Solution {
    public void helper(List<List<Integer>> ans,int k, int n,int start, List<Integer> temp){
        if(temp.size() == k && n == 0){
            List<Integer> total = new ArrayList<>(temp);
            ans.add(total);
            return;
        }

        if(n<0 || temp.size() > k){
            return;
        }

        for(int i = start;i<=9;i++){
            temp.add(i);
            helper(ans,k,n-i,i+1,temp);
            temp.remove(temp.size()-1);
        }
        return;
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int smallest = (k*(k+1))/2;
        List<List<Integer>> ans = new ArrayList<>();
        if(n < smallest) return ans;
        helper(ans,k,n,1,new ArrayList<>());
        return ans;
    }
}