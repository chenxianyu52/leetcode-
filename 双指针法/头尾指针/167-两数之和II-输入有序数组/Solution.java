class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{0, 0};

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了98.94% 的Java用户
 * 内存消耗:44 MB,击败了85.65% 的Java用户
 */