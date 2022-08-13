class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tomiHead = new ListNode();
        tomiHead.next = head;
        ListNode q = tomiHead;
        ListNode p = head;
        while (n > 0) {
            p = p.next;
            n--;
        }
        while (p != null) {
            p = p.next;
            q = q.next;
        }

        ListNode removeNode = q.next;
        q.next = removeNode.next;
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.8 MB,击败了29.59% 的Java用户
 */