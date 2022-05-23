class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        list.add(val);
        Collections.sort(list);
    }

    public void pop() {
        int delete = stack.pop();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == delete) {
                list.remove(i);
                break;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return list.get(0);
    }
}
/**
 * 解答成功:
 * 执行耗时:118 ms,击败了5.14% 的Java用户
 * 内存消耗:44.7 MB,击败了5.01% 的Java用户
 */