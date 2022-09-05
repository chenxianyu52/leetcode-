class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;
        while (startIndex < endIndex) {
            if (numbers[startIndex] + numbers[endIndex] == target) {
                return new int[]{startIndex + 1, endIndex + 1};
            } else if (numbers[startIndex] + numbers[endIndex] > target) {
                endIndex--;
            } else {
                startIndex++;
            }
        }
        return new int[]{startIndex + 1, endIndex + 1};
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.05% 的Java用户
 * 内存消耗:44.5 MB,击败了19.33% 的Java用户
 */