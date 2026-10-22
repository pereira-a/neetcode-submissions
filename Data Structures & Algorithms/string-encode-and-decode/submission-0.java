class Solution {

    private static final String SEPARATOR = "#";

    public String encode(List<String> strs) {
        return strs.stream()
            .map(s -> s.length() + SEPARATOR + s)
            .collect(Collectors.joining());
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>(); 
        while (!str.isEmpty()) {
            int i = 0;
            int sepIndex = str.indexOf(SEPARATOR);
            String length = str.substring(i, sepIndex);
            i = sepIndex + Integer.valueOf(length) + 1;
            result.add(str.substring(sepIndex + 1, i));
            str = str.substring(i);
        }
        return result;
    }
}
