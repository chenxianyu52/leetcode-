class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left >= right) {
            return head;
        }
        ListNode tomiHead = new ListNode();
        ListNode lastNode = tomiHead;
        ListNode p = head;
        ListNode moWei = tomiHead;
        int index = 1;
        while (p != null) {
            ListNode q = p.next;
            if (index <= left) {
                p.next = null;
                lastNode.next = p;
                if (index < left) {
                    lastNode = p;
                }
                moWei = p;
            } else if (index > right) {
                p.next = moWei.next;
                moWei.next = p;
                moWei = p;
            } else {
                p.next = lastNode.next;
                lastNode.next = p;
            }
            index++;
            p = q;
        }
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.8 MB,击败了94.64% 的Java用户
 */