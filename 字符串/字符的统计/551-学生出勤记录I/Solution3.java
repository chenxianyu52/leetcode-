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
        return s.indexOf('A') == s.lastIndexOf('A') && !s.contains("LLL");
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.5 MB,击败了31.58% 的Java用户
 */