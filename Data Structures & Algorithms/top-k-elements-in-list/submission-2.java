class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var countMap =  new HashMap<Integer, Integer>();
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        var res = new int[k];
        
        for(int n: nums) {
            int prevFreq = countMap.getOrDefault(n, 0);
            int freq = prevFreq + 1;
            List<Integer> b = buckets[freq];
            countMap.put(n, freq);
            
            // Initialize the bucket
            if(b == null) {
                b = new ArrayList<Integer>();
                buckets[freq] = b;
            }

            // If n was counted before, remove it from the previous frequency bucket
            if(prevFreq != 0) {
                buckets[prevFreq].remove(Integer.valueOf(n));
            }

            // Add to the frequency bucket
            b.add(n);
        }

        int resIndex = 0;
        for(int i = nums.length; i > 0; i--) {
            List<Integer> l = buckets[i];
            if (l != null) {
                for(int n: l) {
                    res[resIndex++] = n;
                    if (resIndex > k - 1) return res;
                }
            }
        }

        return res;
    }
}
