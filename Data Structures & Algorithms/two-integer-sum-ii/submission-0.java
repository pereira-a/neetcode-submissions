class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, k = numbers.length - 1;
        while (i < k) {
            int t = numbers[i] + numbers[k];
            if (t > target) k--;
            else if(t < target) i++;
            else return new int[]{i+1, k+1};
        }
        return new int[2];
    }
}
