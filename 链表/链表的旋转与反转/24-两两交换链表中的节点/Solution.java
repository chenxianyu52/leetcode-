class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode tomiHead = new ListNode();
        tomiHead.next = head;
        ListNode a = tomiHead;
        ListNode p = head;
        ListNode q = head.next;
        while (p != null && q != null) {
            p.next = q.next;
            q.next = p;
            a.next = q;
            a = p;
            p = p.next;
            if (p == null) {
                break;
            }
            q = p.next;
        }
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.3 MB,击败了29.61% 的Java用户
 */