class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode low = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        ListNode middleHead = low.next;
        low.next = null;
        ListNode fanHead = new ListNode();
        ListNode p = middleHead;
        while (p != null) {
            ListNode tempNext = p.next;
            p.next = fanHead.next;
            fanHead.next = p;
            p = tempNext;
        }
        ListNode a = fanHead.next;
        ListNode b = head;
        while (a != null) {
            if (a.val != b.val) {
                return false;
            }
            a = a.next;
            b = b.next;

        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了99.55% 的Java用户
 * 内存消耗:57.8 MB,击败了41.25% 的Java用户
 */