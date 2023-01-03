class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode tommyHead = new ListNode();
        tommyHead.next = head;
        ListNode p = tommyHead;
        ListNode tt = new ListNode();
        ListNode q = tt;
        while (p.next != null) {
            if (p.next.val >= x) {
                ListNode temp = p.next;
                p.next = temp.next;
                q.next = temp;
                temp.next = null;
                q = q.next;
            } else {
                p = p.next;
            }
        }
        p.next = tt.next;
        return tommyHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.6 MB,击败了97.35% 的Java用户
 */