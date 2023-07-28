class MinStack {

    Stack<Integer> stack;
    List<Integer> list;

    public MinStack() {
        stack = new Stack<>();    
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.push(val);
        list.add(val);
    }
    
    public void pop() {
        stack.pop();
        list.remove(list.size()-1);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return Collections.min(list);
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