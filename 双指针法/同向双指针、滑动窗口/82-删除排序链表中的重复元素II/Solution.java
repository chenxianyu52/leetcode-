class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode tommyHead = new ListNode();
        tommyHead.next = head;
        ListNode p = tommyHead;
        while (p != null) {
            ListNode q = p.next;
            int sum = 1;
            if (q == null || q.next == null) {
                break;
            }
            ListNode k = q.next;
            while (k != null && q.val == k.val) {
                sum++;
                k = k.next;
            }
//            System.out.println("sum: " + sum+" , k: " + k);

            if (sum > 1) {
                p.next = k;
            } else {
                p = p.next;
            }

        }
        return tommyHead.next;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.9 MB,击败了62.95% 的Java用户
 */