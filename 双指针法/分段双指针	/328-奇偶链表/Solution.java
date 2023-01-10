class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode jiHead = new ListNode();
        ListNode jiCurrent = jiHead;
        ListNode ouHead = new ListNode();
        ListNode ouCurrent = ouHead;
        int isJi = 1;
        ListNode p = head;
        while (p != null) {
            if (isJi > 0) {
                jiCurrent.next = p;
                jiCurrent = jiCurrent.next;
//                System.out.println("jiCurrent: " + jiCurrent.val);

            } else {
                ouCurrent.next = p;
                ouCurrent = ouCurrent.next;
//                System.out.println("ouCurrent: " + ouCurrent.val);
            }
            isJi = isJi * (-1);
            p = p.next;
//            System.out.println(p);
        }
        jiCurrent.next = null;
        ouCurrent.next = null;
//        System.out.println("ouhead: " + ouHead.val);
//        System.out.println("ouhead.next: " + ouHead.next.val);

        jiCurrent.next = ouHead.next;
        return jiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.9 MB,击败了65.96% 的Java用户
 */