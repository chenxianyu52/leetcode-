class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tomiHead = new ListNode();
        ListNode q = tomiHead;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                q.next = p1;
                q = p1;
                p1 = p1.next;
            } else {
                q.next = p2;
                q = p2;
                p2 = p2.next;
            }
        }
        if (p1 != null) {
            q.next = p1;
        }
        if (p2 != null) {
            q.next = p2;
        }
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41 MB,击败了43.34% 的Java用户
 */