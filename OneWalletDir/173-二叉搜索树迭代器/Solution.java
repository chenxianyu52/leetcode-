class BSTIterator {
    ArrayList<Integer> list = new ArrayList<>();
    int index = -1;

    public BSTIterator(TreeNode root) {
        getChildNode(root);

    }

    public int next() {
        index++;
        return list.get(index);
    }

    public boolean hasNext() {
        return (index + 1) < list.size();
    }

    private void getChildNode(TreeNode node) {
        if (node == null) {
            return;
        }
        getChildNode(node.left);
        list.add(node.val);
        getChildNode(node.right);
    }
}
/**
 * 解答成功:
 * 执行耗时:16 ms,击败了94.67% 的Java用户
 * 内存消耗:45.1 MB,击败了58.45% 的Java用户
 */