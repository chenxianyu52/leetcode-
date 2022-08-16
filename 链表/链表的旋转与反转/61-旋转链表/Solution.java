class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int sum = 0;
        ListNode p = head;
        while (p != null) {
            sum++;
            p = p.next;
        }

        k = k % sum;
        if (k == 0 || sum == 1) {
            return head;
        }
        ListNode tomiHead = new ListNode();
        tomiHead.next = head;
        ListNode q = tomiHead;

        while (k > 0) {
            q = q.next;
            k--;
        }
        ListNode a = tomiHead;
        while (q != null) {
            if (q.next == null) {
                break;
            } else {
                q = q.next;
                a = a.next;
            }
        }
//        System.out.println("a: " + a.val);
//        System.out.println("q: " + q.val);
        ListNode b = a.next;
        a.next = null;
        q.next = head;
        tomiHead.next = b;
        return tomiHead.next;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.8 MB,击败了67.53% 的Java用户
 */