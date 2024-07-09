class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        minStack.push(Math.min(val,!minStack.isEmpty() ? minStack.peek() : val));
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
