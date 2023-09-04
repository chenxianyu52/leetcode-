class MyStack {

    Deque<Integer> queue1 = new ArrayDeque<>();
    Deque<Integer> queue2 = new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
        if (queue1.isEmpty()) {
            queue1.push(x);
        } else {
            while (!queue1.isEmpty()) {
                queue2.add(queue1.pop());
            }
            queue1.push(x);
        }
    }

    public int pop() {
        int top = queue1.pop();
        if (!queue2.isEmpty()) {
            while (queue2.size() != 1) {
                queue1.push(queue2.pop());
            }
            Deque<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }
        return top;
    }

    public int top() {
        return queue1.peekFirst();
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.3 MB,击败了36.73% 的Java用户
 */