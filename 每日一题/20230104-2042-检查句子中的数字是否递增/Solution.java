class Solution {
    public boolean areNumbersAscending(String s) {
        String[] ss = s.split(" ");
        int pre = 0;
        for (String sm : ss) {
            try {
                int num = Integer.parseInt(sm);
                if (num > pre) {
                    pre = num;
                } else {
                    return false;
                }
            } catch (Exception exception) {

            }
        }
        return true;

    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了24.54% 的Java用户
 * 内存消耗:41.3 MB,击败了9.88% 的Java用户
 */