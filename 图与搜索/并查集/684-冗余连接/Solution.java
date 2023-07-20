class Solution {
    private int[] status;

    public int[] findRedundantConnection(int[][] edges) {
        int len = edges.length;
        status = new int[len + 1];
        for (int i = 0; i <= len; i++) {
            status[i] = i;
        }
        for (int i = 0; i <= len; i++) {
            if (isConnect(edges[i][0], edges[i][1])) {
                return edges[i];
            }
            unit(edges[i][0], edges[i][1], len);
        }
        return new int[2];
    }

    private boolean isConnect(int i, int j) {
        return status[i] == status[j];
    }


    private void unit(int i, int j, int len) {
//        System.out.println("i: " + i + ", j :" + j);
        int x = status[i];
        int y = status[j];
        for (int t = 0; t <= len; t++) {
            if (status[t] == y) {
//                System.out.println("t: " + t + " , j : " + j);
                status[t] = x;
            }
        }
    }
}
/**
 * 执行耗时:4 ms,击败了9.36% 的Java用户
 * 内存消耗:41.2 MB,击败了78.97% 的Java用户
 */