class Solution {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = num.toCharArray();
        int kIndex = 0;
        for (char c : chars) {
            while (!deque.isEmpty() && c < deque.peekLast() && kIndex < k) {
                deque.pollLast();
                kIndex++;
            }
            deque.offer(c);
        }
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (!deque.isEmpty() && j < num.length() - k) {
            if (sb.length() == 0 && deque.peekFirst() == '0') {
                deque.pollFirst();
            } else {
                sb.append(deque.pollFirst());
            }
            j++;
        }
        if (sb.length() == 0) {
            return "0";
        } else {
            return sb.toString();
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:13 ms,击败了50.53% 的Java用户
 * 内存消耗:42.6 MB,击败了50.46% 的Java用户
 */