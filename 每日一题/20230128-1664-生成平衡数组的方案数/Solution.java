class Solution {
    public int waysToMakeFair(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isMatch(list, i)) {
                result++;
            }
        }
        return result;
    }

    private boolean isMatch(List<Integer> list, int index) {
        List<Integer> list1 = new ArrayList<>(list);
        list1.remove(index);
        int sumOu = 0;
        int sumJi = 0;
        int len = list1.size();
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                sumOu += list1.get(i);
            } else {
                sumJi += list1.get(i);
            }
        }
        return sumOu == sumJi;
    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 */