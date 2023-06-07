class Solution {
    Map<Node, Node> map = new HashMap();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node result = new Node(node.val, new ArrayList<>());
        map.put(node, result);
        for (Node listNode : node.neighbors) {
//            if(listNode.val > node.val){
//                System.out.println("listNode: " + listNode.val);
//                Node newNode = cloneGraph(listNode);
            result.neighbors.add(cloneGraph(listNode));
//            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:24 ms,击败了74.35% 的Java用户
 * 内存消耗:40.7 MB,击败了95.49% 的Java用户
 */