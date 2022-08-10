class Solution {
    public void deleteNode(ListNode node) {
        ListNode p = node;
        ListNode q = node.next;
        while (q != null && q.next != null) {
            p.val = q.val;
            p = q;
            q = q.next;
        }
        p.val = q.val;
        p.next = null;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.1 MB,击败了32.96% 的Java用户
 */