class Solution {
    public int evalRPN(String[] tokens) {
        int[] status = new int[tokens.length];
        int index = 0;
        for (String tocken : tokens) {
            if (tocken.equals("+")) {
                int num1 = status[index - 1];
                int num2 = status[index - 2];
                status[index - 2] = num1 + num2;
                index = index - 1;
            } else if (tocken.equals("-")) {
                int num1 = status[index - 1];
                int num2 = status[index - 2];
                status[index - 2] = num2 - num1;
                index = index - 1;
            } else if (tocken.equals("*")) {
                int num1 = status[index - 1];
                int num2 = status[index - 2];
                status[index - 2] = num1 * num2;
                index = index - 1;
            } else if (tocken.equals("/")) {
                int num1 = status[index - 1];
                int num2 = status[index - 2];
                status[index - 2] = num2 / num1;
                index = index - 1;
            } else {
                int num = Integer.parseInt(tocken);
                status[index++] = num;
            }
        }
        return status[0];
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了97.71% 的Java用户
 * 内存消耗:41 MB,击败了65.94% 的Java用户
 */