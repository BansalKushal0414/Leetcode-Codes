/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put(0L,1);
        return dfs(root,0,targetSum,hm);
    }

    public int dfs(TreeNode root, long currSum, int targetSum, HashMap<Long,Integer> hm){
        if(root == null){
            return 0;
        }
        currSum+=root.val;
        int count = hm.getOrDefault((currSum - targetSum),0);
        hm.put(currSum, hm.getOrDefault(currSum,0)+1);
        count+=dfs(root.left,currSum, targetSum,hm);
        count+=dfs(root.right,currSum,targetSum, hm);

        hm.put(currSum, hm.get(currSum) - 1);
        return count;
    }
}