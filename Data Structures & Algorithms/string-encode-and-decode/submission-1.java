class Solution {

    private static final String SEPARATOR = "#";

    public String encode(List<String> strs) {
        return strs.stream()
            .map(s -> s.length() + SEPARATOR + s)
            .collect(Collectors.joining());
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>(); 
        int i = 0;
        while (i < str.length()) {
            int sepIndex = str.indexOf(SEPARATOR, i);
            int endIndex = sepIndex + Integer.parseInt(str.substring(i, sepIndex)) + 1;
            result.add(str.substring(sepIndex + 1, endIndex));
            i = endIndex;
        }
        return result;
    }
}
