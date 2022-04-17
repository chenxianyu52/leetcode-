class Solution {
    public boolean judgeCircle(String moves) {
        int[] status = new int[123];
        char[] chars = moves.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            status[chars[left]]++;
            status[chars[right]]++;
            left++;
            right--;
        }
        return status['U'] == status['D'] && status['L'] == status['R'];
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了99.20% 的Java用户
 * 内存消耗:41.3 MB,击败了37.60% 的Java用户
 */