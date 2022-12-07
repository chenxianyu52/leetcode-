class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(left, -1);
        Arrays.fill(right, len);
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && heights[stack.peekLast()] > heights[i]) {
                right[stack.pollLast()] = i;
            }
            stack.offerLast(i);
        }
        for (int i = len - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && heights[stack2.peekLast()] > heights[i]) {
                left[stack2.pollLast()] = i;
            }
            stack2.offerLast(i);
        }
        int max = 0;
        for (int i = 0; i < len; i++) {
            int height = heights[i];
            int l = left[i];
            int r = right[i];
//            System.out.println("i: " + i + " , height: " + height + ", l: " + l + ", r: " + r);
            max = Math.max(max, (r - l - 1) * height);
//            System.out.println("max: " + max);
        }
        return max;
    }
}
/**
 * 解答成功:
 * 执行耗时:33 ms,击败了39.83% 的Java用户
 * 内存消耗:50.6 MB,击败了97.20% 的Java用户
 */