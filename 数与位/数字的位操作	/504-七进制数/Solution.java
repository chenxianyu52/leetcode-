class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int flag = num >= 0 ? 1 : -1;
        int flagNum = num * flag;
        StringBuilder sb = new StringBuilder();
        while (flagNum != 0) {
            sb.append(flagNum % 7);
            flagNum /= 7;
        }
        if (flag < 0) {
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.6 MB,击败了86.88% 的Java用户
 */