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
    public boolean isBalanced(TreeNode root) {

        if(root == null) { 
            return true;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        return( (Math.max(left,right) - Math.min(left,right)) < 2 && isBalanced(root.left) && isBalanced(root.right) );
        
    }

    private static int depth(TreeNode root){ 
          if(root == null) { 
              return 0;
          }
           int left = depth(root.left);
           int right = depth(root.right); 
            
           return Math.max(left,right)+1;
           
    }
}