class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String str: strs) {
            String key = anagramKey(str);
            res.computeIfAbsent(key, k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(res.values());
    }

    private String anagramKey(String str) {
        int[] counts = new int[26];
        for(char c: str.toCharArray()) {
            counts[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int n :  counts) {
            sb.append(n).append('#');
        }
        return sb.toString();
    }
}
