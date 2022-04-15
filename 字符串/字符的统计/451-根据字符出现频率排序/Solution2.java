class Solution {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        int[] status = new int[128];
        for (int i = 0; i < chars.length; i++) {
            status[chars[i]]++;
        }

        PriorityQueue<Bean> queue = new PriorityQueue<>(new Comparator<Bean>() {
            @Override
            public int compare(Bean o1, Bean o2) {
                return o2.sum - o1.sum;
            }
        });
        for (int i = 0; i < 128; i++) {
            Bean bean = new Bean();
            bean.key = (char) i;
            bean.sum = status[i];
            queue.add(bean);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Bean bean = queue.poll();
            for (int i = 0; i < bean.sum; i++) {
                sb.append(bean.key);
            }
        }

        return sb.toString();
    }

    class Bean {
        public char key;
        public int sum;
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了98.11% 的Java用户
 * 内存消耗:42.1 MB,击败了46.24% 的Java用户
 */