class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> temp = new ArrayDeque<>();
        temp.add(root);


        while (!temp.isEmpty()) {
            List<Integer> valTemp = new ArrayList<>();
            Deque<Node> tt = new ArrayDeque<>();
            while (!temp.isEmpty()) {
                Node node = temp.pollFirst();
//                System.out.println("firstNode : " + node.val);
                valTemp.add(node.val);
//                System.out.println("node.children: " + node.children);
                tt.addAll(node.children);
            }
//            System.out.println("tt.size : " + tt.size());
            result.add(valTemp);
            temp = tt;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了83.75% 的Java用户
 * 内存消耗:42.6 MB,击败了24.96% 的Java用户
 */