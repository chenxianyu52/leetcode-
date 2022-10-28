class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        char preChar = '.';
        int preCharSum = 0;
        int result = 0;
        boolean hasJi = false;
        for (char c : chars) {
//            System.out.println("c : " + c);
            if (c == preChar) {
                preCharSum++;
            } else {
                if (preCharSum % 2 == 0) {
                    result += preCharSum;
                } else {
                    result += (preCharSum - 1);
                    hasJi = true;
                }
                preCharSum = 1;
                preChar = c;
            }
        }
        if (preCharSum % 2 == 0) {
            result += preCharSum;
        } else {
            result += (preCharSum - 1);
            hasJi = true;
        }
        if (hasJi) {
            return result + 1;
        } else {
            return result;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了66.31% 的Java用户
 * 内存消耗:39.3 MB,击败了92.89% 的Java用户
 */