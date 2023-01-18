class Solution {
    public void reorderList(ListNode head) {
        ListNode low = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            low = low.next;
            fast = fast.next.next;
        }

        ListNode p = low.next;
        low.next = null;
        ListNode daoHead = new ListNode();
        while (p != null) {
            ListNode q = p.next;
            p.next = daoHead.next;
            daoHead.next = p;
            p = q;
        }

        ListNode a = head;
        ListNode b = daoHead.next;
        while (b != null) {
            ListNode bNext = b.next;
            b.next = a.next;
            a.next = b;
            a = b.next;
            b = bNext;
        }

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.84% 的Java用户
 * 内存消耗:44.2 MB,击败了40.89% 的Java用户
 */