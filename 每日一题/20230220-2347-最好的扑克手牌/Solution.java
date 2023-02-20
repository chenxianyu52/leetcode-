class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(suits);
        if (suits[0] == suits[4]) {
            return "Flush";
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int i = 0; i < 5; i++) {
            int preSum = map.getOrDefault(ranks[i], 0);
            preSum++;
            map.put(ranks[i], preSum);
            max = Math.max(max, preSum);
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
 * 执行耗时:1 ms,击败了31.63% 的Java用户
 * 内存消耗:38.9 MB,击败了84.18% 的Java用户
 */