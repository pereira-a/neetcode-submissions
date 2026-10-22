class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums) {
            set.add(n);
        }

        for (int n: nums) {
            if (!set.contains(n - 1)) {
                int i = n + 1;
                int count = 1;
                while (set.contains(i)) {
                    count++;
                    i++;
                }

                res = Math.max(count, res);
            }
        }

        return res;
    }
}
