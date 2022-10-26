class Solution {
    public int distributeCandies(int[] candyType) {
        int len = candyType.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(candyType[i]);
            if (len / 2 <= set.size()) {
                return len / 2;
            }
        }
        return set.size();
    }
}
/**
 * 解答成功:
 * 执行耗时:21 ms,击败了95.78% 的Java用户
 * 内存消耗:43 MB,击败了90.27% 的Java用户
 */