class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode p1 = l1;
        ListNode p2 = l2;
//        int sum1 = 0;
//        int sum2 = 0;
        while (p1 != null) {
            stack1.push(p1.val);
            p1 = p1.next;
//            sum1++;
        }
        while (p2 != null) {
            stack2.push(p2.val);
            p2 = p2.next;
//            num2++;
        }
        ListNode tomiHead = new ListNode();
        boolean isJinwei = false;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int a = stack1.isEmpty() ? 0 : stack1.pop();
            int b = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = a + b + (isJinwei ? 1 : 0);
            ListNode newNode = new ListNode();
            if (sum >= 10) {
                newNode.val = sum % 10;
                isJinwei = true;
            } else {
                newNode.val = sum;
                isJinwei = false;
            }
            newNode.next = tomiHead.next;
            tomiHead.next = newNode;
        }
        if (isJinwei) {
            ListNode newNode = new ListNode();
            newNode.val = 1;
            newNode.next = tomiHead.next;
            tomiHead.next = newNode;
        }
        return tomiHead.next;
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了34.47% 的Java用户
 * 内存消耗:41.4 MB,击败了62.57% 的Java用户
 */