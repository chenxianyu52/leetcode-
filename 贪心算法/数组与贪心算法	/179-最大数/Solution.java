class Solution {
    public String largestNumber(int[] nums) {
        String[] numsString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsString[i] = nums[i] + "";
        }
        Arrays.sort(numsString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String ab = o1 + o2;
                String ba = o2 + o1;
                return ba.compareTo(ab);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numsString.length; i++) {
            sb.append(numsString[i]);
        }
        int index = 0;
        while (index < sb.length() - 1 && sb.charAt(index) == '0') {
            index++;
        }
        return sb.substring(index);
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了87.13% 的Java用户
 * 内存消耗:41.3 MB,击败了24.11% 的Java用户
 */