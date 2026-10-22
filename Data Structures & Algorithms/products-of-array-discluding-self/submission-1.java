class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] suff = new int[nums.length];

        res[0] = 1;
        suff[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++) {
            res[i] = nums[i - 1] * res[i -1];
        }

        for(int i = nums.length - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            res[i] = res[i] * suff[i];
        }

        return res;
    }
}  
