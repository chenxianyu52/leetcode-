class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
//        char[] chars = columnTitle.toCharArray();
        int res = 0;
        for (int i = 0; i < len; i++) {
            res = res * 26 + (int) (columnTitle.charAt(i) - 'A' + 1);
//            System.out.println("res: " + res);
        }
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.1 MB,击败了61.84% 的Java用户
 */