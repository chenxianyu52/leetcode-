class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        return twoPice(lists, 0, len - 1); // [start,end)
    }

    public ListNode twoPice(ListNode[] lists, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return lists[start];
        }
        int mid = (end + start) / 2;
        ListNode left = twoPice(lists, start, mid);
        ListNode right = twoPice(lists, mid + 1, end);
        if (left != null && right != null) {
            return merge(left, right);
        } else if (left != null) {
            return left;
        } else {
            return right;
        }
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode tomeHead = new ListNode();
        ListNode a = tomeHead;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                a.next = p1;
                a = p1;
                p1 = p1.next;
            } else {
                a.next = p2;
                a = p2;
                p2 = p2.next;
            }
        }
        if (p1 != null) {
            a.next = p1;
        }
        if (p2 != null) {
            a.next = p2;
        }
        return tomeHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:43.5 MB,击败了35.15% 的Java用户
 */