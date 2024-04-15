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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(subRoot==null || check(root,subRoot))return true; 
        if(root == null)return false;

        return(isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot));
  
    }

    private boolean check(TreeNode a,TreeNode b){
        if(a==null && b==null)return true;
        if( a==null || b==null || a.val!=b.val)return false;

        return(check(a.left,b.left) && check(a.right,b.right));
    }
}