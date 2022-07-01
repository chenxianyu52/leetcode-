class Solution {
    public int repeatedStringMatch(String a, String b) {
        if (a.length() > b.length()) {
            if (a.contains(b)) {
                return 1;
            }
            String doubleString = a + a;
            if (doubleString.contains(b)) {
                return 2;
            } else {
                return -1;
            }
        } else {
            String resultString = a;
            int result = 1;
            while (resultString.length() <= (b.length() * 2)) {
                if (resultString.contains(b)) {
                    return result;
                } else {
                    resultString += a;
                    result++;
                }
            }
            if (resultString.contains(b)) {
                return result;
            }
        }
        return -1;
    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 */