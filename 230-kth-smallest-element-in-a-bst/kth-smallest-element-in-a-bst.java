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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        Collections.sort(arr);
        return arr.get(k-1);
    }
    public static void  dfs(TreeNode root,List<Integer>arr){
          if(root == null) { 
             int i =1;
          }
          arr.add(root.val);
          if(root.left!=null) dfs(root.left,arr);
          if(root.right!=null) dfs(root.right,arr);

    }

    

    
}