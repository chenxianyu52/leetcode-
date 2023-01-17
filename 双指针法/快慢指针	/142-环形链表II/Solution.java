public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet();
        ListNode p = head;
        int index = 0;
        while (p != null) {
            if (set.contains(p)) {
                return p;
            }
            set.add(p);
            p = p.next;
        }
        return null;

    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了18.49% 的Java用户
 * 内存消耗:42.2 MB,击败了16.44% 的Java用户
 */