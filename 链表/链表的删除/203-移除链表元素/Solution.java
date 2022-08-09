class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode tomiHead = new ListNode();
        tomiHead.next = head;
        ListNode q = tomiHead;
        ListNode p = head;
        while (p != null) {
            if (p.val == val) {
                q.next = p.next;
            } else {
                q = q.next;
            }
            p = p.next;
        }
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:42.6 MB,击败了5.59% 的Java用户
 */