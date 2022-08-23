class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tomiHead = new ListNode();
        ListNode q = tomiHead;
        boolean isJinwei = false;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null) {
            int sum = p1.val + p2.val + (isJinwei ? 1 : 0);
            if (sum >= 10) {
                isJinwei = true;
            } else {
                isJinwei = false;
            }
            p1.val = sum % 10;
            q.next = p1;
            q = q.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p1 != null) {
            while (p1 != null) {
                int sum = p1.val + (isJinwei ? 1 : 0);
                if (sum >= 10) {
                    isJinwei = true;
                } else {
                    isJinwei = false;
                }
                p1.val = sum % 10;
                q.next = p1;
                q = q.next;
                p1 = p1.next;
            }
        }
        if (p2 != null) {
            q.next = p2;
            while (p2 != null) {
                int sum = p2.val + (isJinwei ? 1 : 0);
                if (sum >= 10) {
                    isJinwei = true;
                } else {
                    isJinwei = false;
                }
                p2.val = sum % 10;
                q.next = p2;
                q = q.next;
                p2 = p2.next;
            }
        }
        if (isJinwei) {
            ListNode a = new ListNode(1);
            q.next = a;
        }
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了55.70% 的Java用户
 */