class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tomiHead = new ListNode();
        tomiHead.next = head;
        ListNode start = head;  // [start..end) 为已经排好续的
        ListNode preEnd = head;
        ListNode end = head.next;
        while (end != null) {
            ListNode k = tomiHead.next;
            ListNode pre = tomiHead;
//            System.out.println("111end.val : " + end.val + " ,k.val: " + k.val);
            boolean isInsert = false;
            while (k != end) {
//                System.out.println("222k.val : " + k.val + " , end.val : " + end.val);
                if (k.val >= end.val) {
                    preEnd.next = end.next;
                    end.next = k;
                    pre.next = end;
//                    System.out.println("333k.val: " + k.val + " , end.next.val : " + end.next.val);
                    end = preEnd.next;
                    isInsert = true;
                    break;
                } else {
                    pre = k;
                    k = k.next;
                }
            }
            if (!isInsert) {
                preEnd = end;
                end = end.next;
            }
        }
        return tomiHead.next;
    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 */