class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tomiHead = new ListNode();
        ListNode p = head;
        while (p != null) {
            ListNode q = p.next;
            p.next = tomiHead.next;
            tomiHead.next = p;
            p = q;
        }
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.6 MB,击败了12.36% 的Java用户
 */