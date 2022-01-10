class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int result = 0;
        int len = citations.length;
        //[3,0,6,1,5]
        for (int i = 0; i < len; i++) {
            if (citations[i] > 0) {
                if (citations[i] <= len - i) {
                    result = Math.max(result, citations[i]);

                } else {
                    int lenTmp = len - i;
                    result = Math.max(result, lenTmp);
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 				执行耗时:1 ms,击败了77.22% 的Java用户
 * 				内存消耗:36.1 MB,击败了87.36% 的Java用户
 */