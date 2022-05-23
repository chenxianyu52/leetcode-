class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>(); // 使用辅助栈

    public MinStack() {
        tempStack.add(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        int top = tempStack.peek();
        if (top >= val) {
            tempStack.add(val);
        } else {
            tempStack.add(top);
        }
    }

    public void pop() {
        stack.pop();
        tempStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return tempStack.peek();
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了93.25% 的Java用户
 * 内存消耗:43.1 MB,击败了52.72% 的Java用户
 */