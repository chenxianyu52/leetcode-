class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new ArrayDeque<>();
        Queue<Integer> direQueue = new ArrayDeque<>();
        char[] chars = senate.toCharArray();
        int len = chars.length;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {
                radiantQueue.add(i);
            }
            if (chars[i] == 'D') {
                direQueue.add(i);
            }
        }
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radIndex = radiantQueue.poll();
            int direIndex = direQueue.poll();
            if (radIndex < direIndex) {
                radiantQueue.add(radIndex + len);
            } else {
                direQueue.add(direIndex + len);
            }
        }

        if (!radiantQueue.isEmpty()) {
            return "Radiant";
        } else {
            return "Dire";
        }

    }
}
/**
 * 解答成功:
 * 执行耗时:9 ms,击败了59.09% 的Java用户
 * 内存消耗:41.8 MB,击败了48.75% 的Java用户
 */