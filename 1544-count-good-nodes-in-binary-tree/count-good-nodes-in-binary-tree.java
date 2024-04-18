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
    public int goodNodes(TreeNode root) {
        if(root == null) {
             return 0;
        }
        return dfs(root,root.val);
    }

    private int dfs(TreeNode a,int max){ 
         if(a == null)return 0;
         int res = a.val >=max ? 1 : 0;
         max = Math.max(max,a.val);

         res += dfs(a.left,max);
         res += dfs(a.right,max);

         return res;
    }
}