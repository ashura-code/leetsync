class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            arr.add(curr.val);
            
            // Note the order of pushing to the stack:
            // Right child is pushed first so that left child is processed first (since stack is LIFO).
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }

        return arr;
    }
}
