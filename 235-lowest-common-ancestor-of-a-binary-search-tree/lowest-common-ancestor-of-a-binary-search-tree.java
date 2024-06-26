/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

          if(p.val<=q.val) {
             return lca(root,p,q);
          }
          else{ 
             return lca(root,q,p);
          }
         

    }

    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

        if(p.val <= root.val && q.val>=root.val){ 
             return root;
        }
        else if(p.val <=root.val && q.val <= root.val){ 
             return lca(root.left,p,q);
        }
        else{ 
             return lca(root.right,p,q);
        }
         
    }
}