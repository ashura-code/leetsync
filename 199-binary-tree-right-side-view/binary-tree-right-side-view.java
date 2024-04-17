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
    public List<Integer> rightSideView(TreeNode root) { 
         List<Integer> ans = new ArrayList<>();
         List<List<Integer>> arr = new ArrayList<>(); 
         Queue<TreeNode> queue = new LinkedList<>(); 
         if(root == null) {
             return ans;
         } 
         queue.add(root);

         while(!queue.isEmpty()){ 
              int len = queue.size(); 
              List<Integer> temp = new ArrayList<>();
              for(int i=0;i<len;i++) { 
                 TreeNode curr = queue.poll();
                 temp.add(curr.val);
                 if(curr.left!=null)queue.add(curr.left);
                 if(curr.right!=null)queue.add(curr.right);
              }   
              arr.add(temp);     
        }

        for(List<Integer> a:arr ){ 
            ans.add(a.get(a.size()-1));
        }

        return ans;

        
    }
}