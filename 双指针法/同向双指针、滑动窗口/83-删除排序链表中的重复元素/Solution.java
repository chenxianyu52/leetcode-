class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode q = p.next;
        while (q != null) {
            if (p.val == q.val) {
                p.next = q.next;
                q = p.next;
            } else {
                p = p.next;
                q = p.next;
            }
        }
        return head;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了5.60% 的Java用户
 */