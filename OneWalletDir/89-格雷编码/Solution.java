class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = result.size() - 1; j >= 0; j--) {
                result.add(head + result.get(j));
            }
            head <<= 1;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了70.37% 的Java用户
 * 内存消耗:46.7 MB,击败了74.32% 的Java用户
 */