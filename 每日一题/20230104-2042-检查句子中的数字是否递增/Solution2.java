class Solution {
    public boolean areNumbersAscending(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int i = 0;
        int pre = 0;
        while (i < len) {
            int num = 0;
            while (i < len && chars[i] != ' ') {
                if (Character.isDigit(chars[i])) {

                    num = num * 10 + chars[i] - '0';
//                    System.out.println("num: " + num);
                }
                i++;
            }
            if (num == 0) {
                i++;
                continue;
            }
            if (num > pre) {
                pre = num;
            } else {
                return false;
            }
            i++;
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.3 MB,击败了96.52% 的Java用户
 */