class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (chars[i] == ')' && c != '(') {
                    return false;
                }
                if (chars[i] == '}' && c != '{') {
                    return false;
                }
                if (chars[i] == ']' && c != '[') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了98.93% 的Java用户
 * 内存消耗:39.2 MB,击败了88.29% 的Java用户
 */