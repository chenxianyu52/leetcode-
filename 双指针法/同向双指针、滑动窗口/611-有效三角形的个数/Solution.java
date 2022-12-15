class Solution {
    public int triangleNumber(int[] nums) {
        int len = nums.length;
        if(len < 3){
            return 0;
        }
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0;i<len - 2;i++){
            int line1 = nums[i];

            for(int j = len - 1;j> i + 1;j--){
                int line3 = nums[j];
                for(int k = j - 1;k >i;k--){
                    int line2 = nums[k];
                    if(line1 + line2 > line3 ){
                        sum ++;
                    } else {
                        break;
                    }
                }
            }
        }
        return sum;
    }
}
/**
 *
 */