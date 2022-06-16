class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        int levelSize = 1;
        int tempSize = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.peek() != null) {
            tempSize = 0;
            TreeNode firstNode = queue.poll();
            int preValue = firstNode.val;
            if (preValue % 2 == level % 2) {
                return false;
            }
            levelSize--;
            if (firstNode.left != null) {
                queue.add(firstNode.left);
                tempSize++;
            }
            if (firstNode.right != null) {
                queue.add(firstNode.right);
                tempSize++;
            }
//            System.out.println("firstNode.val = " + firstNode.val + " , preValue: " + preValue + " , level: " + level + " , levelSize : " + levelSize);
            while (levelSize > 0) {
                TreeNode node = queue.poll();
//                System.out.println("node.val = " + node.val + " , preValue: " + preValue + " , level: " + level);
                if (level % 2 == 1) {
                    if (node.val % 2 != 0) {
                        return false;
                    }
                    if (node.val >= preValue) {
                        return false;
                    } else {
                        preValue = node.val;
                    }
                } else {
                    if (node.val % 2 != 1) {
                        return false;
                    }
                    if (node.val <= preValue) {
                        return false;
                    } else {
                        preValue = node.val;
                    }
                }
                if (node.left != null) {
                    queue.add(node.left);
                    tempSize++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    tempSize++;
                }
                levelSize--;
            }
            level++;
            levelSize = tempSize;
        }

        return true;

    }
}
/**
 * 解答成功:
 * 执行耗时:10 ms,击败了46.70% 的Java用户
 * 内存消耗:58.2 MB,击败了18.23% 的Java用户
 */