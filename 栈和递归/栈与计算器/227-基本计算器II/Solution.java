class Solution {
    public int calculate(String s) {
        char[] chars = s.toCharArray();
        char preSign = '+';
        Stack<Integer> quequ = new Stack<>();
        int i = 0;
        while (i < chars.length) {
            int res = 0;
//            System.out.println("i: " + i);
            while (i < chars.length && ((chars[i] >= '0' && chars[i] <= '9') || chars[i] == ' ')) {
                if (chars[i] == ' ') {
                    i++;
                    continue;
                }
                res = res * 10 + (chars[i] - '0');
                i++;
            }
            switch (preSign) {
                case '+':
                    quequ.push(res);
                    break;
                case '-':
                    quequ.push(res * (-1));
                    break;
                case '*':
                    quequ.push(quequ.pop() * res);
                    break;
                case '/':
                    quequ.push(quequ.pop() / res);
                    break;
                default:
                    break;
            }
            if (i < chars.length) {
                preSign = chars[i];
            }
            i++;

        }
        int result = 0;
        while (!quequ.isEmpty()) {
            result += quequ.pop();
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:15 ms,击败了56.90% 的Java用户
 * 内存消耗:41.7 MB,击败了59.36% 的Java用户
 */