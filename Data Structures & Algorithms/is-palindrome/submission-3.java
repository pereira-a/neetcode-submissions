class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !isAlphaNum(s.charAt(i))) i++;
            while (i < j && !isAlphaNum(s.charAt(j))) j--;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;

            i++;
            j--;
        }

        return true;
    }

    public boolean isAlphaNum(char c) {
        return (c <= 'Z' && c >= 'A') ||
               (c <= 'z' && c >= 'a') ||
               (c <= '9' && c >= '0');
    }
}
