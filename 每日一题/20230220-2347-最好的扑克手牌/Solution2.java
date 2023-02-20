class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(suits);
        if (suits[0] == suits[4]) {
            return "Flush";
        }
        int[] status = new int[14];
        int max = 1;
        for (int i = 0; i < 5; i++) {
            status[ranks[i]]++;
            max = Math.max(max, status[ranks[i]]);
        }
        if (max >= 3) {
            return "Three of a Kind";
        } else if (max == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.4 MB,击败了24.49% 的Java用户
 */