class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        int sum = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            sum++;
        }
        int count = sum / k;
        ListNode tomiHead = new ListNode();
        ListNode lastNode = tomiHead;
        p = head;
        while (count > 0) {
            count--;
            ListNode pre = p;
            for (int i = 0; i < k; i++) {
                ListNode q = p.next;
                p.next = lastNode.next;
                lastNode.next = p;
                p = q;
            }
            lastNode = pre;
        }
        if (sum % k != 0) {
            lastNode.next = p;
        }
        return tomiHead.next;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41 MB,击败了69.50% 的Java用户
 */