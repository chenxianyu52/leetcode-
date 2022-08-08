class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int result = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for (int i = 0; i < len; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了54.45% 的Java用户
 * 内存消耗:41.4 MB,击败了42.75% 的Java用户
 */