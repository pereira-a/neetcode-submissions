class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int tIndex = 0;

        res[tIndex] = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = res[tIndex] * nums[tIndex];
                res[tIndex] = 0;
                tIndex = i;
            } else {
                res[tIndex] *= nums[i];
            }
        }

        if(tIndex == 0) {
            for(int i = 1; i < nums.length; i++) {
                res[i] = res[i - 1] * nums[i - 1] / nums[i];
            }
        }
        
        return res;
    }
}  
