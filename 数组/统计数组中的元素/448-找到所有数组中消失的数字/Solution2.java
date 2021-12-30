class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int tmp = nums[0];
        while (i < len) {
            // [4,3,2,7,8,2,3,1]
            if (tmp != nums[tmp - 1]) {
                int temp = nums[tmp - 1];
                nums[tmp - 1] = tmp;
                tmp = temp;
            } else {
                i++;
                if(i<len){
                    tmp = nums[i];
                }
            }
        }
        for (int j = 0; j < len; j++) {
            if (nums[j] != j + 1) {
                list.add(j + 1);
            }
        }
        return list;
    }
}

/**
 * 解答成功:
 * 				执行耗时:5 ms,击败了50.19% 的Java用户
 * 				内存消耗:47.2 MB,击败了69.82% 的Java用户
 */