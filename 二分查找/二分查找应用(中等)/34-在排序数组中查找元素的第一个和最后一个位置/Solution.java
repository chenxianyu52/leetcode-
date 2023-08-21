class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums[0] == target && nums[nums.length - 1] == target) {
            return new int[]{0, nums.length - 1};
        }
        int left = 0;
        int right = nums.length - 1;
        int middle = left + (right - left) / 2;
        int index = -1;
        while (left <= right) {
            if (nums[middle] == target) {
                index = middle;
                break;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;
        }
        if (index == -1) {
            return new int[]{-1, -1};
        }

        int left1 = 0;
        int right1 = index - 1;
        int middle1 = left1 + (right1 - left1) / 2;
        int index1 = index;
        while (left1 <= right1) {
//            System.out.println("left1: " + left1 + ", right1: " + right1 + ",middle1 : " + middle1);
            if (nums[middle1] == target) {
                index1 = middle1;
                right1 = middle1 - 1;
            } else if (nums[middle1] < target) {
                left1 = middle1 + 1;
            }
            middle1 = left1 + (right1 - left1) / 2;
        }


        int left2 = index;
        int right2 = nums.length - 1;
        int middle2 = left2 + (right2 - left2) / 2;
        int index2 = -1;
        while (left2 <= right2) {
//            System.out.println("left2: " + left2 + ", right2: " + right2 + ",middle2 : " + middle2);
            if (nums[middle2] == target) {
                index2 = middle2;
                left2 = middle2 + 1;
            } else if (nums[middle2] > target) {
                right2 = middle2 - 1;
            }
            middle2 = left2 + (right2 - left2) / 2;
        }
//        System.out.println("index2: " + index2);


        return new int[]{index1, index2};

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:43.7 MB,击败了5.62% 的Java用户
 */