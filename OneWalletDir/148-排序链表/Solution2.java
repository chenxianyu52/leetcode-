class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
            }
//            System.out.println("slow : " + slow.val + " , fast: " + fast.val);
        }
        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
//        System.out.println("left: " + left.val);
        ListNode right = sortList(tmp);
//        System.out.println("right: " + right.val);
        ListNode result = new ListNode(0, null);
        ListNode h = result;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                result.next = left;
                left = left.next;
            } else {
                result.next = right;
                right = right.next;
            }
            result = result.next;
        }

        if (left != null) {
            result.next = left;
        }
        if (right != null) {
            result.next = right;
        }
        return h.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:10 ms,击败了34.87% 的Java用户
 * 内存消耗:49.2 MB,击败了37.64% 的Java用户
 */