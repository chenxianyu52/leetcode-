class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(0, n, k, new ArrayList<>());
        return result;
    }

    private void dfs(int start, int n, int k, List<Integer> temp) {
        if (k == temp.size()) {
            result.add(new ArrayList<>(temp));
            return;
        }
//        if(temp.size() > 0 && temp.get(temp.size() - 1) == n){
//            return;
//        }

        for (int i = start + 1; i <= n - (k - temp.size()) + 1; i++) {
            Integer num = i;
//            System.out.println("num: " + num);
            temp.add(num);
            dfs(i, n, k, temp);
            temp.remove(num);
//            System.out.println("temp:size " + temp.size());
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了68.79% 的Java用户
 * 内存消耗:42.8 MB,击败了44.69% 的Java用户
 */