class MinStack {

    List<Node> stack = new ArrayList<>();
    int min_value = Integer.MAX_VALUE;

    public MinStack() {
    }

    public void push(int val) {
        Node curr = new Node(val, Math.min(min_value, val));
        stack.add(curr);
        if (curr.val < min_value)
            min_value = curr.val;
    }

    public void pop() {
        if (stack.isEmpty()) {
            return; 
        }
        Node poppedNode = stack.remove(stack.size() - 1);
        if (poppedNode.val == min_value) {
            if (stack.isEmpty()) {
                min_value = Integer.MAX_VALUE; 
            } else {
                min_value = stack.get(stack.size() - 1).min; 
            }
        }
    }

    public int top() {
        Node a = stack.get(stack.size() - 1);
        return a.val;
    }

    public int getMin() {
        return min_value;
    }

    private class Node {
        int val;
        int min;

        private Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */