class Solution {
    public String originalDigits(String s) {
        // "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        /**
         * e	0 1 3 5 7 8 9
         * f	4 5
         * g	8
         * h	3 8
         * i	5 6 8 9
         * n	1 7 9
         * o	0 1 2 4
         * r	0 3 4
         * s	6 7
         * t	2 3 8
         * u	4
         * v	5 7
         * w	2
         * x	6
         * z	0
         */
        HashMap<Character, Integer> map = new HashMap<>();
        int[] status = new int[26];
        char[] chars = s.toCharArray();
        int[] statusOver = new int[10];
        for (char c : chars) {
            status[c - 'a']++;
        }
        statusOver[0] = status['z' - 'a'];
        statusOver[2] = status['w' - 'a'];
        statusOver[4] = status['u' - 'a'];
        statusOver[6] = status['x' - 'a'];
        statusOver[8] = status['g' - 'a'];
        statusOver[1] = status['o' - 'a'] - statusOver[0] - statusOver[2] - statusOver[4];
        statusOver[3] = status['h' - 'a'] - statusOver[8];
        statusOver[5] = status['f' - 'a'] - statusOver[4];
        statusOver[7] = status['v' - 'a'] - statusOver[5];
        statusOver[9] = status['i' - 'a'] - statusOver[5] - statusOver[6] - statusOver[8];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (statusOver[i] <= 0) {
                continue;
            }
            for (int j = 0; j < statusOver[i]; j++) {
                sb.append(i);
            }
        }

        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了99.76% 的Java用户
 * 内存消耗:41.6 MB,击败了59.90% 的Java用户
 */