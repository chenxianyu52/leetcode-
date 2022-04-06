class Solution {
    public int countSegments(String s) {
        //Of all the gin joints in all the towns in all the world,
        int len = s.length();
        int result = 0;
        int start = -1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                if (i - start >= 2) {
                    result++;
                }
                start = i;
            }
        }
        if (len - start >= 2) {
            result++;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39 MB,击败了47.43% 的Java用户
 */