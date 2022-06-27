class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sbList = new StringBuilder[numRows];
        int len = s.length();
        char[] chars = s.toCharArray();
        int tempSum = 0;
        if (numRows > 1) {
            tempSum = numRows * 2 - 2;
        } else {
            tempSum = numRows;
        }

        for (int i = 0; i < len; i++) {
            int tempI = i % tempSum;
//            System.out.println("tempI: " + tempI + " , chars: " + chars[i]);
            if (tempI < numRows) {
                if (sbList[tempI] == null) {
                    sbList[tempI] = new StringBuilder();
                }
                sbList[tempI].append(chars[i]);
            } else {
                int temp = numRows - 2;
                sbList[numRows - 1 - (tempI - numRows) - 1].append(chars[i]);
            }
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            if (sbList[i] != null) {
                result.append(sbList[i]);
            }
        }
        return result.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了83.89% 的Java用户
 * 内存消耗:42.1 MB,击败了38.30% 的Java用户
 */