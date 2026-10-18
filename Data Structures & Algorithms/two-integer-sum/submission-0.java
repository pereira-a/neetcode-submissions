class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var val1 = nums[i];
            var val2 = target - val1;
            var val2Index = map.get(val2);

            if (val2Index == null) {
                map.put(val1, i);
            } else {
                return new int[]{val2Index, i};
            }
        }
        return new int[0];
    }
}
