class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (String s : ops) {
            if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                int pre = stack.peek();
                stack.push(pre * 2);
            } else if (s.equals("+")) {
                int last = stack.pop();
                int lastTwo = stack.peek();
                stack.push(last);
                stack.push(last + lastTwo);
            } else {
                int num = Integer.parseInt(s);
                stack.add(num);
            }
        }
        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了84.30% 的Java用户
 * 内存消耗:40 MB,击败了26.28% 的Java用户
 */