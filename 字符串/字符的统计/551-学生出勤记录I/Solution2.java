class Solution {
    public boolean checkRecord(String s) {
        /**
         * 'A'：Absent，缺勤
         * 'L'：Late，迟到
         * 'P'：Present，到场
         *
         * 按 总出勤 计，学生缺勤（'A'）严格 少于两天。
         *  && 学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
         */
        int ASum = 0;
        int LSum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                ASum++;
                LSum = 0;
                if (ASum >= 2) {
                    return false;
                }
            }
            if (c == 'L') {
                LSum++;
                if (LSum >= 3) {
                    return false;
                }
            }
            if (c == 'P') {
                LSum = 0;
            }
        }
        return true;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.5 MB,击败了36.91% 的Java用户
 */