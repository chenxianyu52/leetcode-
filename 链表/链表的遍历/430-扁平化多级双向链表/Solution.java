class Solution {
    public Node flatten(Node head) {
        getLastNode(head);
        return head;
    }

    public Node getLastNode(Node node) {
        if (node == null) {
            return null;
        }
        Node p = node;
        Node last = node;
        while (p != null) {
            if (p.child == null) {
                p = p.next;
            } else {
//                System.out.println("p: " + p.val);
                Node q = getLastNode(p.child);
//                System.out.println("q: " + q.val);
                Node temp = p.next;
                Node child = p.child;
                p.next = child;
                child.prev = p;
                p.child = null;
                q.next = temp;
                if (temp != null) {
                    temp.prev = q;
                }
                p = p.next;
            }
            if (p != null) {
                last = p;
            }
        }
        return last;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了12.77% 的Java用户
 * 内存消耗:39.5 MB,击败了56.35% 的Java用户
 */