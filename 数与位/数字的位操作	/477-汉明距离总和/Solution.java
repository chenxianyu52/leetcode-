class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for(int i = 0;i< nums.length - 1;i++){
            for(int j = i + 1;j< nums.length;j++){
                res+= getHammingDistance(nums[i],nums[j]);
            }
        }
        return res;
    }

    private int getHammingDistance(int a , int b){
        int res = 0;
        while(a != b){
            if( (a & 1) != (b & 1)){
                res ++;
            }
            a >>>= 1;
            b >>>= 1;
        }
        return res;
    }
}
/**
 * Time Limit Exceeded
 */