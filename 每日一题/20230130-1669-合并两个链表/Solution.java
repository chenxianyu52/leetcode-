class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
//        ListNode tommyHead = new ListNode();
//        tommyHead.next = list1;
        ListNode p = list1;
        int index = 0;
        ListNode g = list2;
        while (g != null && g.next != null) {
            g = g.next;
        }
        while (index < (a - 1)) {
            p = p.next;
            index++;
        }
//        System.out.println("p : " + p.val);
        ListNode q = p.next;
//        System.out.println("index: " + index);
        while (index < b) {
            q = q.next;
            index++;
        }
        p.next = list2;
        g.next = q;
        return list1;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:44.9 MB,击败了46.48% 的Java用户
 */