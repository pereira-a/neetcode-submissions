class Solution {
    public int trap(int[] height) {
        int res = 0, l = 0, r = height.length - 1;
        int maxL = height[l], maxR = height[r];

        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                maxL = Math.max(maxL, height[l]);
                res += maxL - height[l];
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                res += maxR - height[r];
            }
        }
        return res;
    }
}
