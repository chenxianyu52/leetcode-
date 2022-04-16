class Solution {
    // zero one two three four five six seven eight
    private String[] numsString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private int[] status = new int[26];

    public String originalDigits(String s) {

        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            status[c - 'a']++;
        }
        List<Integer> sb = new ArrayList<>();
        int len = numsString.length;
        while (true) {
            // 说明有 0 zero z是唯一标识不会出现重复情况
            if (status['z' - 'a'] > 0) {
                handle(sb, 0);
                continue;
            }
            // 说明有 8 eight g是唯一标识不会出现重复情况
            if (status['g' - 'a'] > 0) {
                handle(sb, 8);
                continue;
            }

            // 说明有 6 six x是唯一标识不会出现重复情况
            if (status['x' - 'a'] > 0) {
                handle(sb, 6);
                continue;
            }

            // 说明有 2 two w是唯一标识不会出现重复情况
            if (status['w' - 'a'] > 0) {
                handle(sb, 2);
                continue;
            }

            // 说明有 4 four u是唯一标识不会出现重复情况
            if (status['u' - 'a'] > 0) {
                handle(sb, 4);
                continue;
            }

            // 说明有 3 three h是除了8以外唯一标识不会出现重复情况
            if (status['h' - 'a'] > 0) {
                handle(sb, 3);
                continue;
            }

            // 说明有 7 seven s是除了6以外唯一标识不会出现重复情况
            if (status['s' - 'a'] > 0) {
                handle(sb, 7);
                continue;
            }

            // 说明有 5 five s是除了7以外唯一标识不会出现重复情况
            if (status['v' - 'a'] > 0) {
                handle(sb, 5);
                continue;
            }

            // 说明有 1 one o是除了0，2，4以外唯一标识不会出现重复情况
            if (status['o' - 'a'] > 0) {
                handle(sb, 1);
                continue;
            }

            // 其他情况就是9了
            if (status['n' - 'a'] > 0) {
                handle(sb, 9);
                continue;
            }
            break;
        }
        Collections.sort(sb);
        StringBuilder result = new StringBuilder();
        for (Integer i : sb) {
            result.append(i);
        }
        return result.toString();

    }

    private void handle(List<Integer> sb, int index) {
        char[] ssChars = numsString[index].toCharArray();
        for (char c : ssChars) {
            status[c - 'a']--;
        }
        sb.add(index);
    }
}
/**
 * 穷举，看看有没有更好的方案。
 * 解答成功:
 * 执行耗时:12 ms,击败了57.70% 的Java用户
 * 内存消耗:41.8 MB,击败了46.94% 的Java用户
 */