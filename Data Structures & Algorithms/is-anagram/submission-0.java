class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> sOrdered = s.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
        List<Character> tOrdered = t.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
        return sOrdered.equals(tOrdered);

    }
}
