class Solution {
    int[] status;
    List<Integer>[] list;
    int result = 0;

    public int countArrangement(int n) {
        status = new int[n + 1];
        list = new List[n + 1];
        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i % j == 0 || j % i == 0) {
                    list[i].add(j);
                }
            }
        }
        process(1, n);
        return result;
    }

    private void process(int index, int sum) {
        if (index == sum + 1) {
            result++;
            return;
        }

        for (Integer i : list[index]) {
            if (status[i] == 0) {
                status[i]++;
                process(index + 1, sum);
                status[i]--;
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:41 ms,击败了72.20% 的Java用户
 * 内存消耗:41 MB,击败了19.02% 的Java用户
 */