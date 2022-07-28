class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        char[] chars = columnTitle.toCharArray();
        int res = 0;
        for (int i = 0; i < len; i++) {
            res = res * 26 + (int) (chars[i] - 'A' + 1);
//            System.out.println("res: " + res);
        }
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了41.09% 的Java用户
 * 内存消耗:39.9 MB,击败了78.62% 的Java用户
 */