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
            int max = 2 * a.length() + b.length();
            while (resultString.length() < max) {
                if (resultString.contains(b)) {
                    return result;
                } else {
                    resultString += a;
                    result++;
                }
            }
//            if(resultString.contains(b)){
//                return result;
//            }
        }
        return -1;
    }
}
/**
 * 解答成功:
 * 执行耗时:308 ms,击败了21.01% 的Java用户
 * 内存消耗:41.9 MB,击败了10.26% 的Java用户
 */