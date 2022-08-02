class Solution {
    public String simplifyPath(String path) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] strings = path.split("/");
        for (String s : strings) {
//            System.out.println("s: " + s);
            if ("..".equals(s)) {
                if (!queue.isEmpty()) {
                    queue.pollLast();
                }
            } else if (".".equals(s)) {
                continue;
            } else {
                if (!s.isEmpty()) {
                    queue.addLast(s);
                }
            }
        }
//        System.out.println("peek1: " + queue.peekLast());
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
//            System.out.println("peek: " + queue.peekFirst());
            String ss = queue.pollFirst();
            sb.append("/");
            sb.append(ss);
        }
        if (sb.length() == 0) {
            return "/";
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了91.61% 的Java用户
 * 内存消耗:41.7 MB,击败了35.71% 的Java用户
 */