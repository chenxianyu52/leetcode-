public class Codec {

    // Encodes a tree to a single string.
    Map<Integer, String> map = new HashMap<>();
    int maxDepth = 0;

    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root, 0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= maxDepth; i++) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(map.get(i));
        }
        return sb.toString();
    }

    private void dfs(TreeNode root, int depth) {
        maxDepth = Math.max(depth, maxDepth);
        String pre = map.getOrDefault(depth, "");
        StringBuilder sb = new StringBuilder(pre);
        if (!"".equals(pre)) {
            sb.append(",");
        }
        if (root == null) {
            sb.append("#");
        } else {
            sb.append(root.val);
        }
        map.put(depth, sb.toString());
        if (root != null) {
            dfs(root.left, depth + 1);
            dfs(root.right, depth + 1);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        System.out.println(data);
        if (data == null) {
            return null;
        }
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        TreeNode head = new TreeNode();
        deque.addLast(head);
        String[] strings = data.split(",");
        int index = 1;
        head.val = Integer.parseInt(strings[0]);
        while (!deque.isEmpty()) {
            TreeNode parent = deque.pollFirst();
            if ("#".equals(strings[index])) {
                parent.left = null;
            } else {
                TreeNode left = new TreeNode(Integer.parseInt(strings[index]));
                parent.left = left;
                deque.addLast(left);
            }
            index++;
            if ("#".equals(strings[index])) {
                parent.right = null;
            } else {
                TreeNode right = new TreeNode(Integer.parseInt(strings[index]));
                parent.right = right;
                deque.addLast(right);
            }
            index++;
        }
        return head;

    }
}
/**
 * 解答成功:
 * 执行耗时:39 ms,击败了24.09% 的Java用户
 * 内存消耗:43 MB,击败了79.28% 的Java用户
 */