class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        while (x != 0 || y != 0) {
//            System.out.println("x : " + x + " , y : " + y);
            if ((x & 1) != (y & 1)) {
                res++;
            }
            x >>>= 1;
            y >>>= 1;
        }
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.7 MB,击败了13.33% 的Java用户
 */