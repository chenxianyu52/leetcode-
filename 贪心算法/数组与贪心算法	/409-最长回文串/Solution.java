class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int result = 0;
        boolean hasJi = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                result += entry.getValue();
            } else {
                result += (entry.getValue() - 1);
                hasJi = true;
            }
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
 * 执行耗时:7 ms,击败了32.89% 的Java用户
 * 内存消耗:40.2 MB,击败了10.64% 的Java用户
 */