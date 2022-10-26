class Solution {
    public int distributeCandies(int[] candyType) {
        int len = candyType.length;
        int half = len / 2;
        byte[] status = new byte[200001];
        for (int type : candyType) {
            len -= status[type + 100000];
            status[type + 100000] = 1;
        }
        return Math.min(half, len);
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了100.00% 的Java用户
 * 内存消耗:42.7 MB,击败了94.83% 的Java用户
 */