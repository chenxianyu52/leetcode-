class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int result = 0;
        int len = energy.length;
        int sumEnergy = initialEnergy;
        int sumExperience = initialExperience;
        for (int i = 0; i < len; i++) {
            int en = energy[i];
            int ex = experience[i];
            if (en >= sumEnergy) {
                int cha = en - sumEnergy + 1;
                result += cha;
                sumEnergy += cha;
            }
            sumEnergy -= en;

            if (ex >= sumExperience) {
                int cha = ex - sumExperience + 1;
                result += cha;
                sumExperience += cha;
            }
            sumExperience += ex;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.9 MB,击败了50.30% 的Java用户
 */