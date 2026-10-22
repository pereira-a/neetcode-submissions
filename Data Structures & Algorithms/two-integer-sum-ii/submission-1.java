class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;   // need a larger sum
            } else {
                right--;  // numbers[right] can't pair with anything >= numbers[left]
            }
        }
        throw new IllegalArgumentException("No valid pair; input violates the problem guarantee");
    }
}