class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        // Sort (n log(n))
        Arrays.sort(nums);
        
        // O(n^2)
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int k = i + 1, j = nums.length - 1;
            int target = -nums[i];
            while (k < j) {
                int t = nums[k] + nums[j];
                if (t < target) k++;
                else if (t > target) j--;
                else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k++;
                    j--;
                    while (k < j && nums[k] == nums[k - 1]) k++;

                }
            }
        }
        return res;
    }
}
