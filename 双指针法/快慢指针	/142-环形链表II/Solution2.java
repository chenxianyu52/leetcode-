public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode low = head;
        ListNode fast = head;
        while (true) {
            if (fast == null || fast.next == null || fast.next.next == null) {
                return null;
            }
            low = low.next;
            fast = fast.next.next;
            if (low == fast) {
                break;
            }
        }
        fast = head;
        while (fast != low) {
            fast = fast.next;
            low = low.next;
        }
        return fast;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.6 MB,击败了79.81% 的Java用户
 */