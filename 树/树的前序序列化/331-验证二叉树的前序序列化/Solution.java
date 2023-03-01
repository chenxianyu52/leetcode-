class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = preorder.toCharArray();
        int i = 0;
        stack.push(1);
        while (i < chars.length) {
            if (stack.isEmpty()) {
                return false;
            }
            if (chars[i] == ',') {
                i++;
                continue;
            }
            if (chars[i] == '#') {
                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }
                i++;
            } else {
                while (i < chars.length && chars[i] != ',') {
                    i++;
                }
                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }
                stack.push(2);
            }
        }
        return stack.isEmpty();
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了31.65% 的Java用户
 * 内存消耗:40.1 MB,击败了77.39% 的Java用户
 */