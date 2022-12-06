class Solution {
    public String removeDuplicateLetters(String s) {
        boolean[] status = new boolean[26];
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            count[c - 'a']++;
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            count[c - 'a']--;
            if (status[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && c < stack.peek()) {
                if (count[stack.peek() - 'a'] == 0) {
                    break;
                }
                char top = stack.pop();
//                System.out.println("c : " + c + " , top: " + top);
                status[top - 'a'] = false;
            }
            stack.push(c);
            status[c - 'a'] = true;
        }
        while (!stack.isEmpty()) {
            char top = stack.pop();
            sb.append(top);
        }
        return sb.reverse().toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了80.88% 的Java用户
 * 内存消耗:40.5 MB,击败了65.93% 的Java用户
 */