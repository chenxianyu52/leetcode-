public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        if (p == null || p.next == null) {
            return false;
        }
        ListNode q = p.next;
        while (p != null) {
            if (p == q) {
                return true;
            }
            if (q != null) {
                q = q.next;
            } else {
                return false;
            }
            if (p == q) {
                return true;
            }
            if (q != null) {
                q = q.next;
            } else {
                return false;
            }
            p = p.next;
        }
        return false;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:42.6 MB,击败了56.47% 的Java用户
 */