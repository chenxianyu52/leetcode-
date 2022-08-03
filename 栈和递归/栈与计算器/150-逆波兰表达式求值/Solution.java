class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String tocken : tokens) {
            if (tocken.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1 + num2);
            } else if (tocken.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            } else if (tocken.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1 * num2);
            } else if (tocken.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            } else {
                int num = Integer.parseInt(tocken);
                stack.push(num);
            }
        }
        return stack.peek();

    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了57.03% 的Java用户
 * 内存消耗:40.9 MB,击败了73.66% 的Java用户
 */