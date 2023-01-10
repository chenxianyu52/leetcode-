public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了97.95% 的Java用户
 * 内存消耗:44.6 MB,击败了20.18% 的Java用户
 */