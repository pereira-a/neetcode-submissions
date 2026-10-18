class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var countMap =  new HashMap<Integer, Integer>();
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        var res = new int[k];
        
        // Count frequencies
        for (int n : nums) countMap.merge(n, 1, Integer::sum);

        // Order frequencies by bucket
        for (Map.Entry<Integer, Integer> e : countMap.entrySet()) {
            int freq = e.getValue();
            if (buckets[freq] == null) buckets[freq] = new ArrayList<Integer>();
            buckets[freq].add(e.getKey());
        }

        // Mount result
        int resIndex = 0;
        for(int i = nums.length ; i > 0; i--) {
            List<Integer> bucket = buckets[i];
            if (bucket == null) continue;
            for(int n : bucket) {
                res[resIndex++] = n;
                if(resIndex == k) return res;
            }
        }

        return res;
    }
}
